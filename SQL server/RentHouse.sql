-- User
Create table Users (
	Username varchar (30) Primary Key NOT NULL,
	Password varchar (30) NOT NULL,
	Usertype varchar (30) NOT NULL,
	CONSTRAINT CHK_User 
	CHECK (Usertype = 'Student' OR Usertype = 'Landlord' OR Usertype = 'Staff')
);

-- Student
Create table StudentInfo (
	StudentID varchar (30) Primary Key NOT NULL,
	Student_Name varchar (30),
	Student_Phone varchar (30),
	Student_Email varchar (30),
	Student_Status bit
);

Create table dbo.Student (
	StudentID varchar (30) NOT NULL,
	Username varchar(30) NOT NULL,
	primary key(StudentID, Username),
	foreign key (StudentID) references StudentInfo (StudentID)
        on delete cascade
        on update cascade,
    foreign key (Username) references Users(Username)
        on delete cascade
        on update cascade
);

-- Landlord

Create table dbo.LandlordInfo (
	LandlordID varchar (30) Primary Key NOT NULL,
	Landlord_Name varchar (30),
	Landlord_Phone varchar (30),
	Landlord_Email varchar (30)
);

Create table dbo.Landlord (
	LandlordID varchar (30) NOT NULL,
	Username varchar(30) NOT NULL,
	primary key(LandlordID, Username),
	foreign key (LandlordID) references LandlordInfo (LandlordID)
        on delete cascade
        on update cascade,
    foreign key (Username) references Users(Username)
        on delete cascade
        on update cascade
);

-- Staff
Create table dbo.StaffInfo (
	StaffID varchar(30) Primary Key NOT NULL,
	Staff_Name varchar (30),
	Staff_Phone varchar (30),
	Staff_Email varchar (30)
);

Create table dbo.Staff (
	StaffID varchar (30) NOT NULL,
	Username varchar(30) NOT NULL,
	primary key(StaffID, Username),
	foreign key (StaffID) references StaffInfo (StaffID)
        on delete cascade
        on update cascade,
    foreign key (Username) references Users(Username)
        on delete cascade
        on update cascade
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

-- Test
INSERT INTO Users (Username, Password, Usertype)
VALUES ('chokem', 'chokem', 'Staff');

select * from Users
select * from StudentInfo
select * from Student
select * from LandlordInfo
select * from Landlord
select * from StaffInfo
select * from Staff
select * from House