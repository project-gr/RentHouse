-- Create table

-- Student
Create table dbo.StudentAccount (
	Student_username varchar (30) Primary Key NOT NULL,
	Student_password varchar (30)
);

Create table dbo.StudentInfo (
	StudentID varchar (30) Primary Key NOT NULL,
	Student_Name varchar (30),
	Student_Phone varchar (30),
	Student_Email varchar (30),
	Student_Status bit
);

Create table dbo.Student (
	StudentID varchar (30) NOT NULL,
	Student_username varchar(30) NOT NULL,
	primary key(StudentID, Student_username),
	foreign key (StudentID) references StudentInfo (StudentID)
        on delete cascade
        on update cascade,
    foreign key (Student_username) references StudentAccount(Student_username)
        on delete cascade
        on update cascade
);

-- Landlord
Create table dbo.LandlordAccount (
	Landlord_username varchar (30) Primary Key NOT NULL,
	Landlord_password varchar (30)
);

Create table dbo.LandlordInfo (
	LandlordID varchar (30) Primary Key NOT NULL,
	Landlord_Name varchar (30),
	Landlord_Phone varchar (30),
	Landlord_Email varchar (30)
);

Create table dbo.Landlord (
	LandlordID varchar (30) NOT NULL,
	Landlord_username varchar(30) NOT NULL,
	primary key(LandlordID, Landlord_username),
	foreign key (LandlordID) references LandlordInfo (LandlordID)
        on delete cascade
        on update cascade,
    foreign key (Landlord_username) references LandlordAccount(Landlord_username)
        on delete cascade
        on update cascade
);

-- Staff
Create table dbo.Staff (
	Staff_username varchar(30) Primary Key NOT NULL,
	Staff_password varchar (30),
	Staff_Name varchar (30),
	Staff_Phone varchar (30),
	Staff_Email varchar (30)
);

-- House
Create table dbo.House (
	HouseID varchar (30) NOT NULL PRIMARY KEY CLUSTERED,
	House_No int,
	Address varchar (30),
	Street varchar (30),
	District varchar (30),
	City varchar (30),
	House_Status bit
);

CREATE SEQUENCE CountBy1  
START WITH 1  
INCREMENT BY 1 ;  
GO

CREATE TRIGGER IncreaseNumber
ON House
INSTEAD OF INSERT
AS
DECLARE @HouseID VARCHAR(30),
	@NextID INT,
	@House_No INT,
	@Address varchar (30),
	@Street varchar (30),
	@District varchar (30),
	@City varchar (30),
	@House_Status bit
SELECT @NextID = NEXT VALUE FOR CountBy1,
	@HouseID = 'House_',
	@House_No = House_No,
	@Address = Address,
	@Street = Street,
	@District = District,
	@City = City,
	@House_Status = House_Status
FROM INSERTED
INSERT INTO House VALUES (
	@HouseID + RIGHT('00000000' + CAST(@NextID AS VARCHAR(8)), 8),
	@House_No,
	@Address,
	@Street,
	@District,
	@City,
	@House_Status
);

-- House...
Create table House_Landlord (
	LandlordID varchar (30) NOT NULL,
	HouseID VARCHAR(30) NOT NULL,
	primary key(LandlordID, HouseID),
	foreign key (LandlordID) references LandlordInfo (LandlordID)
        on delete cascade
        on update cascade,
    foreign key (HouseID) references House (HouseID)
        on delete cascade
        on update cascade
);

Create table House_Student (
	StudentID varchar (30) NOT NULL,
	HouseID VARCHAR(30) NOT NULL,
	primary key(StudentID, HouseID),
	foreign key (StudentID) references StudentInfo (StudentID)
        on delete cascade
        on update cascade,
    foreign key (HouseID) references House (HouseID)
        on delete cascade
        on update cascade
);

-- Test
INSERT INTO House(House_Status)
VALUES ('true');

INSERT INTO LandlordInfo(LandlordID)
VALUES ('chokem');

INSERT INTO House_Landlord(LandlordID, HouseID)
VALUES ('chokem', 'House_00000001');

-- Display
select * from StudentInfo
select * from StudentAccount
select * from Student
select * from LandlordInfo
select * from LandlordAccount
select * from Landlord
select * from House
select * from House_Landlord
select * from House_Student
select * from Staff