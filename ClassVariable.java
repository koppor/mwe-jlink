import java.lang.module.ModuleDescriptor;

class ClassVariable {

    ModuleDescriptor[] result;

    public void method0() {
        result[0] = null;
        return;
    }

    public void method1() {
        result[1] = null;
        return;
    }

    public ModuleDescriptor[] moduleDescriptors() {
        result = new ModuleDescriptor[10];
        method0();
        method1();
        return result;
    }

    public static void main (String args[]) {
        ClassVariable classVariable = new ClassVariable();
        ModuleDescriptor[] result = classVariable.moduleDescriptors();
        System.out.println(result[0]);
    }
}