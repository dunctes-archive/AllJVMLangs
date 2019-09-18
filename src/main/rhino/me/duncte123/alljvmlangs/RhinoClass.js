const System = Packages.java.lang.System;

function RhinoClass() {
    System.out.println("Booting rhino class?");
}

RhinoClass.prototype.returnMessage = function() {
    return "Hello from rhino";
};

var cls = new RhinoClass();

cls.returnMessage();
