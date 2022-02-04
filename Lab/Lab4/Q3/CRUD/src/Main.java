import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import crudops.CrudOps;
import schema.StudentSchema;

public class Main extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idTextField;
	private JTextField nameTextField;
	private JTextField ageTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CrudOps crudops = new CrudOps();
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id:");
		lblNewLabel.setBounds(10, 11, 49, 14);
		contentPane.add(lblNewLabel);
		
		idTextField = new JTextField();
		idTextField.setBounds(73, 8, 317, 20);
		contentPane.add(idTextField);
		idTextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBounds(10, 42, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(73, 39, 317, 20);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Age:");
		lblNewLabel_2.setBounds(10, 73, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		ageTextField = new JTextField();
		ageTextField.setBounds(73, 70, 317, 20);
		contentPane.add(ageTextField);
		ageTextField.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(10, 141, 89, 23);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = nameTextField.getText();
				String a = ageTextField.getText();
				try {
					int age = Integer.parseInt(a);
					crudops.create(name, age);
					idTextField.setText("Added!");
					nameTextField.setText("");
					ageTextField.setText("");
				} catch (Exception error) {
					idTextField.setText("Give valid Input");
				}
			}
		});
		contentPane.add(btnAdd);
		
		JButton btnRead = new JButton("Read");
		btnRead.setBounds(109, 141, 89, 23);
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i = idTextField.getText();
				try {
					int id = Integer.parseInt(i);
					StudentSchema student = crudops.readOne(id);
					nameTextField.setText(student.getName());
					ageTextField.setText(Integer.toString(student.getAge()));
					idTextField.setText(Integer.toString(student.getId()));
				} catch (Exception error) {
					idTextField.setText("Give valid Input");
				}
			}
		});
		contentPane.add(btnRead);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(225, 141, 89, 23);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i = idTextField.getText();
				String name = nameTextField.getText();
				String a = ageTextField.getText();
				try {
					int id = Integer.parseInt(i);
					int age = Integer.parseInt(a);
					crudops.update(id, name, age);
					nameTextField.setText("");
					ageTextField.setText("");
				} catch (Exception error) {
					idTextField.setText("Give valid Input");
				}
			}
		});
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(337, 141, 89, 23);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String i = idTextField.getText();
				try {
					int id = Integer.parseInt(i);
					crudops.delete(id);
					idTextField.setText("Deleted!");
				} catch (Exception error) {
					idTextField.setText("Give valid Input");
				}
			}
		});
		contentPane.add(btnDelete);
	}
}
