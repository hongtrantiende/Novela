package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hh0  reason: default package */
/* loaded from: classes3.dex */
public abstract class hh0 implements m42, o82, Serializable {
    private final m42 completion;

    public hh0(m42 m42Var) {
        this.completion = m42Var;
    }

    public m42 create(m42 m42Var) {
        m42Var.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.o82
    public o82 getCallerFrame() {
        m42 m42Var = this.completion;
        if (m42Var instanceof o82) {
            return (o82) m42Var;
        }
        return null;
    }

    public final m42 getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i2;
        kq2 kq2Var = (kq2) getClass().getAnnotation(kq2.class);
        String str2 = null;
        if (kq2Var == null || kq2Var.v() < 1) {
            return null;
        }
        int i3 = -1;
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(this);
            if (obj2 instanceof Integer) {
                num = (Integer) obj2;
            } else {
                num = null;
            }
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            i = i2 - 1;
        } catch (Exception unused) {
            i = -1;
        }
        if (i >= 0) {
            i3 = kq2Var.l()[i];
        }
        zg4 zg4Var = w9e.d;
        zg4 zg4Var2 = w9e.e;
        if (zg4Var2 == null) {
            try {
                zg4 zg4Var3 = new zg4(17, Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                w9e.e = zg4Var3;
                zg4Var2 = zg4Var3;
            } catch (Exception unused2) {
                w9e.e = zg4Var;
                zg4Var2 = zg4Var;
            }
        }
        if (zg4Var2 != zg4Var && (method = (Method) zg4Var2.b) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = (Method) zg4Var2.c) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = (Method) zg4Var2.d;
            if (method3 != null) {
                obj = method3.invoke(invoke2, null);
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str2 = obj;
            }
        }
        if (str2 == null) {
            str = kq2Var.c();
        } else {
            str = str2 + '/' + kq2Var.c();
        }
        return new StackTraceElement(str, kq2Var.m(), kq2Var.f(), i3);
    }

    public abstract Object invokeSuspend(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m42
    public final void resumeWith(Object obj) {
        while (true) {
            hh0 hh0Var = this;
            m42 m42Var = hh0Var.completion;
            m42Var.getClass();
            try {
                obj = hh0Var.invokeSuspend(obj);
                if (obj == n82.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new gs9(th);
            }
            hh0Var.releaseIntercepted();
            if (m42Var instanceof hh0) {
                this = m42Var;
            } else {
                m42Var.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public m42 create(Object obj, m42 m42Var) {
        m42Var.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
