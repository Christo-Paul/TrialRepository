create table Page_A ( 
page_A_Id int AUTO_INCREMENT PRIMARY KEY, 
page_A_Name varchar(20) not null 
);


create table Page_B ( 
page_B_Id int AUTO_INCREMENT PRIMARY KEY, 
page_B_Name varchar(35) not null, 
page_A_Id int,
foreign key(page_A_Id) references Page_A(page_A_Id)
);


create table Page_C ( 
page_C_Id int AUTO_INCREMENT PRIMARY KEY, 
page_C_Name varchar(35) not null, 
page_B_Id int,
foreign key(page_B_Id) references Page_B(page_B_Id)
);

create table Page_D ( 
page_D_Id int AUTO_INCREMENT PRIMARY KEY, 
page_D_Name varchar(35) not null, 
page_C_Id int,
foreign key(page_C_Id) references Page_C(page_C_Id)
);

insert into Page_A(page_A_Name) values('Investment_Banking');
insert into Page_A(page_A_Name) values('Retail_Banking');

insert into Page_B(page_B_Name,page_A_Id) values('Corporate_Finance(Advisory)',1);
insert into Page_B(page_B_Name,page_A_Id) values('Capital_Market(Execution)',1);

insert into Page_B(page_B_Name,page_A_Id) values('Private_Banks',2);
insert into Page_B(page_B_Name,page_A_Id) values('Public_Banks',2);


insert into Page_C(page_C_Name,page_B_Id) values('Industry Coverage',1);
insert into Page_C(page_C_Name,page_B_Id) values('Merger&Acquisition',1);

insert into Page_C(page_C_Name,page_B_Id) values('Equity_ Capital_Market',2);
insert into Page_C(page_C_Name,page_B_Id) values('Debt_Capital _Market',2);

update Page_C set page_C_Name='Industry_Coverage' where page_C_Id=1;

update Page_C set page_C_Name='Equity_Capital_Market' where page_C_Id=3;
update Page_C set page_C_Name='Debt_Capital_Market' where page_C_Id=4;

insert into Page_C(page_C_Name,page_B_Id) values('Deposits',3);
insert into Page_C(page_C_Name,page_B_Id) values('Card_Services',3);
insert into Page_C(page_C_Name,page_B_Id) values('Insurance',3);

insert into Page_C(page_C_Name,page_B_Id) values('Personal_Banking',4);
insert into Page_C(page_C_Name,page_B_Id) values('NRI_Services',4);
insert into Page_C(page_C_Name,page_B_Id) values('Agricultural_Services',4);

insert into Page_D(page_D_Name,page_C_Id) values('Healthcare',1);
insert into Page_D(page_D_Name,page_C_Id) values('RealEstate',1);
insert into Page_D(page_D_Name,page_C_Id) values('Energy',1);
insert into Page_D(page_D_Name,page_C_Id) values('Joint_Ventures',2);
insert into Page_D(page_D_Name,page_C_Id) values('Split-Offs',2);


insert into Page_D(page_D_Name,page_C_Id) values('IPOs',3);
insert into Page_D(page_D_Name,page_C_Id) values('Follow-On',3);
insert into Page_D(page_D_Name,page_C_Id) values('Private_Placement',3);

insert into Page_D(page_D_Name,page_C_Id) values('Investment_Grade',4);
insert into Page_D(page_D_Name,page_C_Id) values('Leveraged_Finance',4);

insert into Page_D(page_D_Name,page_C_Id) values('Current_Deposit',5);
insert into Page_D(page_D_Name,page_C_Id) values('Recurring_Deposit',5);
insert into Page_D(page_D_Name,page_C_Id) values('Fixed_Deposit',5);

insert into Page_D(page_D_Name,page_C_Id) values('Credit_Card',6);
insert into Page_D(page_D_Name,page_C_Id) values('Debit_Card',6);

insert into Page_D(page_D_Name,page_C_Id) values('Car_Insurance',7);
insert into Page_D(page_D_Name,page_C_Id) values('House_Insurance',7);
insert into Page_D(page_D_Name,page_C_Id) values('Life_Insurance',7);

insert into Page_D(page_D_Name,page_C_Id) values('Accounts',8);
insert into Page_D(page_D_Name,page_C_Id) values('Loans',8);
insert into Page_D(page_D_Name,page_C_Id) values('Other_Services',8);

insert into Page_D(page_D_Name,page_C_Id) values('Home_loans',9);
insert into Page_D(page_D_Name,page_C_Id) values('Trading',9);
insert into Page_D(page_D_Name,page_C_Id) values('Money_transfer&Insurance',9);

insert into Page_D(page_D_Name,page_C_Id) values('Agricultural_Loans',10);
insert into Page_D(page_D_Name,page_C_Id) values('Kissan_Credit_Card',10);
