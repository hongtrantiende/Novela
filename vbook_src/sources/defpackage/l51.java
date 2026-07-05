package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l51  reason: default package */
/* loaded from: classes3.dex */
public abstract class l51 implements u66, Serializable, u96 {
    public static final Object NO_RECEIVER = k51.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient u66 reflected;
    private final String signature;

    public l51(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.u66
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.u66
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public u66 compute() {
        u66 u66Var = this.reflected;
        if (u66Var == null) {
            u66 computeReflected = computeReflected();
            this.reflected = computeReflected;
            return computeReflected;
        }
        return u66Var;
    }

    public abstract u66 computeReflected();

    @Override // defpackage.u96
    public GenericDeclaration findJavaDeclaration() {
        x66 owner = getOwner();
        String signature = getSignature();
        signature.getClass();
        if (owner instanceof xh1) {
            String G0 = k4b.G0(signature, '(');
            if (!G0.equals("<init>")) {
                Method[] declaredMethods = ((xh1) owner).c().getDeclaredMethods();
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    if (c16.i(method.getName(), G0)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(method.getName());
                        sb.append("(");
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        parameterTypes.getClass();
                        for (Class<?> cls : parameterTypes) {
                            cls.getClass();
                            fbe.u(sb, cls);
                        }
                        sb.append(")");
                        Class<?> returnType = method.getReturnType();
                        returnType.getClass();
                        fbe.u(sb, returnType);
                        if (sb.toString().equals(signature)) {
                            return method;
                        }
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + owner + '/' + signature);
        }
        return null;
    }

    @Override // defpackage.t66
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.u66
    public String getName() {
        return this.name;
    }

    public x66 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            cm9.a.getClass();
            return new kh8(cls);
        }
        return cm9.a(cls);
    }

    @Override // defpackage.u66
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract u66 getReflected();

    @Override // defpackage.u66
    public t76 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.u66
    public List<ksc> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.u66
    public z76 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.u66
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.u66
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.u66
    public boolean isOpen() {
        return getReflected().isOpen();
    }
}
