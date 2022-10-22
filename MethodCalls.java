import java.lang.module.ModuleDescriptor;

class MethodCalls {

    public void method0(ModuleDescriptor[] moduleDescriptors) {
        moduleDescriptors[0] = null;
        return;
    }

    public void method1(ModuleDescriptor[] moduleDescriptors) {
        moduleDescriptors[1] = null;
        return;
    }

    public ModuleDescriptor[] moduleDescriptors() {
        ModuleDescriptor[] result = new ModuleDescriptor[10];
        method0(result);
        method1(result);
        return result;
    }

    public static void main (String args[]) {
        MethodCalls methodCalls = new MethodCalls();
        ModuleDescriptor[] result = methodCalls.moduleDescriptors();
        System.out.println(result[0]);
    }
}
