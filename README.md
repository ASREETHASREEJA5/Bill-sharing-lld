Introduction : 
Our project aims to develop an easy-to-use system for managing shared expenses within groups. It simplifies tracking of expenses, calculating individual shares, and settling balances. The goal is to ensure fairness and transparency, removing the complexities of managing finances in group settings. The system automatically calculates debt settlements, ensuring accurate and efficient handling of group expenses. This approach promotes a smooth financial experience for all users, eliminating the need for manual calculations. The overall goal is to make group financial management more efficient and user-friendly.
•	Expense Tracking: Simplify the process of tracking shared expenses among group members.
•	Fair Calculation: Ensure accurate and fair distribution of individual contributions based on the expense type.
•	Debt Settlement: Facilitate efficient and transparent debt settlements between group members.

System Architecture : 
1.	User Class: This class holds details for each person using the system, such as their name and the total balance. It tracks how much money a user owes to others, helping the system monitor individual debts and payments.
2.	Expense Class: This class keeps track of each expense. It stores who paid, the total amount, and how it is split between multiple users. It also records who owes money to whom and the exact amounts.
3.	SplitWiseService Class: This class is the main part of the application. It manages creating users, adding expenses, and dividing expenses among users. It ensures the amount each person owes or is owed is updated correctly.
4.	Helper Class: This class offers useful functions, such as generating test data or initializing users. It simplifies tasks like setting up users or creating random data for testing the system.
5.	Balance Calculation & Display: This step calculates the balance for each user—whether they owe money or are owed. It checks the debts and payments and then shows each user’s balance or the group’s overall balance.

Key Features :
•	User-Centric: Designed to track and manage individual expenses, allowing easy tracking of debts and payments.
•	Expense Management: Records and divides expenses among users, ensuring accurate distribution.
•	Interactive: Users can engage with the system by adding, updating, and viewing their expenses.
•	Data Integrity: Maintains precise calculations for balances and ensures accuracy in debt distribution.
•	Scalable: Supports multiple users and expenses, easily adapting to larger groups or more complex use cases.

Implementation Steps : 
1.	Define User Class:
•	Create a User  class with attributes: userId, name, email, mobile, and balances.
•	Include methods to add balances and get balances.
2.	Define Expense Class:
•	Create an Expense class with attributes: payer, amount, participants, expenseType, and shares.
3.	Initialize Application:
•	Create a list to store users.
•	Create a dictionary to track balances between users.
4.	Add User:
•	Input user details (userId, name, email, mobile).
•	Create a new User  object and add it to the user list.
5.	Record Expense:
•	Input details for the expense (payerId, amount, participantsList, expenseType, and optional shares).
•	Validate the expense type:
•	EQUAL: Split the amount equally among participants.
•	EXACT: Ensure the total of shares matches the amount.
•	PERCENT: Ensure the total percentage equals 100.
•	Update balances for each participant based on their share.
6.	Show Balances:
•	Input an optional userId to show balances for a specific user.
•	If userId is provided, display how much each participant owes that user.
•	If no userId is provided, display balances for all users.
7.	Main Loop:
•	Continuously accept user commands until an exit command is received.
•	Parse commands to add users, record expenses, or show balances.
Example of Commands
•	Add User: ADD_USER u1 "John Doe" "john@example.com" "1234567890"
•	Record Expense: EXPENSE u1 1000 3 u2 u3 u4 EQUAL
•	Show Balances: SHOW u1 or SHOW

Applications :  
1.	Group Travel: Split accommodation, transportation, and meal costs fairly among friends or family.
2.	Roommates: Track and manage shared expenses for utilities, groceries, and rent.
3.	Dining Out: Quickly calculate each person’s share when dining with others.
4.	Event Planning: Share costs of organizing events like parties, picnics, or gatherings.
5.	Small Businesses: For team outings, managing office expenses, or project-based costs.

Conclusion:
This project successfully demonstrates an efficient system for managing shared expenses among users. It ensures accurate tracking of balances, allowing users to see detailed records of debts and payments. By utilizing clear input commands and producing comprehensive output, the system simplifies expense management in a group setting. The implementation highlights fairness, accuracy, and flexibility in handling different splitting methods, making it a robust solution for shared financial scenarios.
