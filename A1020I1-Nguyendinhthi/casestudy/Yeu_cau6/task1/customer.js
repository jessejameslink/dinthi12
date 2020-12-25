let customner = function () {
    this.setName = function (Name) {
        this.Name = Name;
    }
    this.getName = function () {
        return this.Name;

    }
    this.setCMND = function (CMND) {
        this.cmnd = CMND;
    }
    this.getCMND = function () {
        return this.CMND;
    }
    this.setBirthday = function (birthday) {
        this.birthday = birthday;
    }
    this.getBirthday = function () {
        return this.birthday;
    }
    this.setEmail = function (email) {
        this.email = email;
    }
    this.getEmail = function () {
        return this.email;
    }
    this.setAddress = function (address) {
        this.address = address;
    }
    this.getAddress = function () {
        return this.address;
    }
    this.setTypeCustomer = function (TypeCustomer) {
        this.typeCustomer = TypeCustomer;
    }
    this.getTypeCustomer = function () {
        return this.typeCustomer;
    }
    this.setTypeRoom = function (TypeRoom) {
        this.TypeRoom = TypeRoom;
    }
    this.getTypeRoom = function () {
        return this.TypeRoom;
    }
    this.setTyservice = function (typeSerice) {
        this.typeservice = typeSericeerice;
    }
    this.getTypeRoom = function () {
        return this.typeservice;
    }
    this.setDiscount = function (discount) {
        this.discount = discount;
    }
    this.getDiscount = function () {
        return this.discount;
    }
    this.setRentaldays = function (rentaldays) {
        this.rentaldays = rentaldays;
    }
    this.getRentaldays = function () {
        return this.rentaldays;
    }
    this.setquantityinclued = function (quantityIncluded) {
        this.quantityinclued = quantityIncluded;
    }
    this.getquantityinclued = function () {
        return this.quantityinclued;
    }
    this.gettotalPays = function () {
        let money = 0;
        if(this.getTyservice==="villa"){
            money = 500;
        } else if (this.typeservice==="house"){
            money = 300;
        }else if (this.typeservice ==="room"){
            money = 200;
        }
        return this.getRentaldays()*money*(1-this.getDiscount/100);
    }
}
