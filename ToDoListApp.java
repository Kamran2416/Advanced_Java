import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class ToDoListApp extends JFrame {
    private DefaultListModel<String> toDoListModel;
    private JList<String> toDoList;
    private JTextField taskInput;

    public ToDoListApp() {
        setTitle("To-Do List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Create the to-do list model and list
        toDoListModel = new DefaultListModel<>();
        toDoList = new JList<>(toDoListModel);
        toDoList.setCellRenderer(new CenterAlignedListCellRenderer()); // Custom cell renderer
        JScrollPane scrollPane = new JScrollPane(toDoList);

        // Create the text input field and add button
        taskInput = new JTextField();
        JButton addButton = new JButton("Add Task");
        JButton removeButton = new JButton("Remove Task");
        JButton clearAllButton = new JButton("Clear All ");

        // Add components to the frame
        add(taskInput, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        buttonPanel.add(clearAllButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // ActionListener for the Add Task button
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String taskDescription = taskInput.getText().trim();
                if (!taskDescription.isEmpty()) {
                    toDoListModel.addElement(taskDescription);
                    taskInput.setText("");
                }
            }
        });

        // ActionListener for the Remove Task button
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = toDoList.getSelectedIndex();
                if (selectedIndex != -1) {
                    toDoListModel.remove(selectedIndex);
                }
            }
        });
        // ActionListener for the Clear All Task Button
        clearAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toDoListModel.clear();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        // SwingUtilities.invokeLater(() -> {
        // new ToDoListApp();
        // });
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ToDoListApp();
            }
        });
    }
}

class CenterAlignedListCellRenderer extends DefaultListCellRenderer {
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
            boolean cellHasFocus) {
        Component renderer = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        setHorizontalAlignment(SwingConstants.CENTER);
        return renderer;
    }
}
