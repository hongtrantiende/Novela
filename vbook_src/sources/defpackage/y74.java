package defpackage;

import android.view.KeyEvent;
import com.highcapable.kavaref.platform.ExecutableAccessor;
import com.highcapable.kavaref.platform.FieldAccessor;
import com.highcapable.kavaref.platform.MethodAccessor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y74  reason: default package */
/* loaded from: classes.dex */
public final class y74 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y74(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, lu4] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, lu4] */
    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        long j;
        Object gs9Var;
        ki4 ki4Var;
        Object gs9Var2;
        ki4 ki4Var2;
        ArrayList l0;
        boolean z = false;
        switch (this.a) {
            case 0:
                int intValue = ((Number) obj).intValue();
                return ((pg2) this.c).invoke(Integer.valueOf(intValue), ((List) this.b).get(intValue));
            case 1:
                int intValue2 = ((Number) obj).intValue();
                return ((pg2) this.c).invoke(Integer.valueOf(intValue2), ((List) this.b).get(intValue2));
            case 2:
                Throwable th = (Throwable) obj;
                uw2.o((AtomicBoolean) this.c, (zl9) this.b);
                return pvc.a;
            case 3:
                KeyEvent keyEvent = ((g86) obj).a;
                keyEvent.getClass();
                if (gae.j(keyEvent) == 2 && e86.a(rae.a(keyEvent.getKeyCode()), e86.A)) {
                    if (((Boolean) ((aw7) this.c).getValue()).booleanValue()) {
                        ((vt4) ((aw7) this.b).getValue()).invoke();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                ((Boolean) obj).booleanValue();
                ((xt4) this.c).invoke(((qn4) this.b).a);
                return pvc.a;
            case 5:
                return ((tn4) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 6:
                int intValue3 = ((Number) obj).intValue();
                return ((pg2) this.c).invoke(Integer.valueOf(intValue3), ((List) this.b).get(intValue3));
            case 7:
                return ((tn4) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 8:
                cra craVar = (cra) obj;
                synchronized (dra.c) {
                    j = dra.e;
                    dra.e = 1 + j;
                }
                return new yv7(j, craVar, (xt4) this.c, (xt4) this.b);
            case 9:
                return ((tn4) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 10:
                return ((tn4) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 11:
                ((Boolean) obj).getClass();
                ((xt4) this.c).invoke(((kb6) this.b).b);
                return pvc.a;
            case 12:
                return ((vb6) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 13:
                Throwable th2 = (Throwable) obj;
                o40 o40Var = (o40) this.c;
                Object obj2 = o40Var.b;
                f61 f61Var = (f61) this.b;
                synchronized (obj2) {
                    ((ArrayList) o40Var.c).remove(f61Var);
                }
                return pvc.a;
            case 14:
                return ((vb6) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 15:
                return ((vb6) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 16:
                return ((vb6) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 17:
                return ((vb6) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 18:
                int intValue4 = ((Number) obj).intValue();
                return ((j35) this.c).invoke(Integer.valueOf(intValue4), ((List) this.b).get(intValue4));
            case 19:
                Class cls = (Class) obj;
                bc7 bc7Var = (bc7) ((zo0) this.c);
                final y67 y67Var = (y67) this.b;
                y67Var.getClass();
                try {
                    gs9Var = b00.D0(cls.getDeclaredMethods());
                } catch (Throwable th3) {
                    gs9Var = new gs9(th3);
                }
                if (hs9.a(gs9Var) == null) {
                    if (gs9Var instanceof gs9) {
                        gs9Var = null;
                    }
                    Object obj3 = (List) gs9Var;
                    if (obj3 == null) {
                        obj3 = ks3.a;
                    }
                    ki4 ki4Var3 = new ki4(3, e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(new ki4(3, e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(new ki4(3, e97.a(new c00(obj3, 1), bc7Var, y67Var), a97.a), y67Var, "parameters", bc7Var.g, new lu4() { // from class: g77
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj4, Object obj5) {
                            return Boolean.valueOf(e97.t(y67.this, (List) obj4, (ExecutableAccessor) obj5));
                        }
                    }), y67Var, "parametersNot", bc7Var.h, new lu4() { // from class: s77
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj4, Object obj5) {
                            return Boolean.valueOf(e97.u(y67.this, (List) obj4, (ExecutableAccessor) obj5));
                        }
                    }), y67Var, "parametersCondition", null, new Object()), y67Var, "parameterCount", null, new Object()), y67Var, "parameterCountCondition", null, new Object()), y67Var, "typeParameters", bc7Var.i, new Object()), y67Var, "typeParametersNot", bc7Var.j, new Object()), y67Var, "exceptionTypes", bc7Var.k, new lu4() { // from class: e87
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj4, Object obj5) {
                            return Boolean.valueOf(e97.P(y67.this, (Set) obj4, (ExecutableAccessor) obj5));
                        }
                    }), y67Var, "exceptionTypesNot", bc7Var.l, new lu4() { // from class: g87
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj4, Object obj5) {
                            return Boolean.valueOf(e97.Q(y67.this, (Set) obj4, (ExecutableAccessor) obj5));
                        }
                    }), y67Var, "genericExceptionTypes", bc7Var.m, new Object()), y67Var, "genericExceptionTypesNot", bc7Var.n, new Object()), y67Var, "genericParameters", bc7Var.o, new Object()), y67Var, "genericParametersNot", bc7Var.p, new Object()), y67Var, "isVarArgs", null, new Object()), y67Var, "isVarArgsNot", null, new Object()), y67Var, "parameterAnnotations", bc7Var.q, new lu4() { // from class: n77
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj4, Object obj5) {
                            return Boolean.valueOf(e97.A(y67.this, (List) obj4, (ExecutableAccessor) obj5));
                        }
                    }), y67Var, "parameterAnnotationsNot", bc7Var.r, new lu4() { // from class: o77
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj4, Object obj5) {
                            return Boolean.valueOf(e97.B(y67.this, (List) obj4, (ExecutableAccessor) obj5));
                        }
                    }), y67Var, "annotatedReturnType", bc7Var.s, new lu4() { // from class: p77
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj4, Object obj5) {
                            return Boolean.valueOf(e97.C(y67.this, (Set) obj4, (ExecutableAccessor) obj5));
                        }
                    }), y67Var, "annotatedReturnTypeNot", bc7Var.t, new lu4() { // from class: q77
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj4, Object obj5) {
                            return Boolean.valueOf(e97.D(y67.this, (Set) obj4, (ExecutableAccessor) obj5));
                        }
                    }), y67Var, "annotatedReceiverType", bc7Var.u, new lu4() { // from class: r77
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj4, Object obj5) {
                            return Boolean.valueOf(e97.E(y67.this, (Set) obj4, (ExecutableAccessor) obj5));
                        }
                    }), y67Var, "annotatedReceiverTypeNot", bc7Var.v, new lu4() { // from class: t77
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj4, Object obj5) {
                            return Boolean.valueOf(e97.G(y67.this, (Set) obj4, (ExecutableAccessor) obj5));
                        }
                    }), y67Var, "annotatedParameterTypes", bc7Var.w, new lu4() { // from class: v77
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj4, Object obj5) {
                            return Boolean.valueOf(e97.H(y67.this, (Set) obj4, (ExecutableAccessor) obj5));
                        }
                    }), y67Var, "annotatedParameterTypesNot", bc7Var.x, new lu4() { // from class: w77
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj4, Object obj5) {
                            return Boolean.valueOf(e97.I(y67.this, (Set) obj4, (ExecutableAccessor) obj5));
                        }
                    }), y67Var, "annotatedExceptionTypes", bc7Var.y, new lu4() { // from class: x77
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj4, Object obj5) {
                            return Boolean.valueOf(e97.J(y67.this, (Set) obj4, (ExecutableAccessor) obj5));
                        }
                    }), y67Var, "annotatedExceptionTypesNot", bc7Var.z, new lu4() { // from class: y77
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj4, Object obj5) {
                            return Boolean.valueOf(e97.K(y67.this, (Set) obj4, (ExecutableAccessor) obj5));
                        }
                    }), d97.a), y67Var, "returnType", null, new lu4() { // from class: j77
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj4, Object obj5) {
                            return Boolean.valueOf(e97.Z(y67.this, obj4, (MethodAccessor) obj5));
                        }
                    }), y67Var, "returnTypeCondition", null, new Object()), y67Var, "genericReturnType", null, new Object()), y67Var, "genericReturnTypeCondition", null, new Object()), y67Var, "isBridge", null, new Object()), y67Var, "isBridgeNot", null, new Object()), y67Var, "isDefault", null, new Object()), y67Var, "isDefaultNot", null, new Object()), y67Var, "defaultValue", null, new Object()), y67Var, "defaultValueCondition", null, new Object()), new Object());
                    gi1 a = cm9.a(Method.class);
                    if (a.equals(cm9.a(Method.class))) {
                        ki4Var = new ki4(3, ki4Var3, new c97(y67Var, 3));
                    } else if (a.equals(cm9.a(Constructor.class))) {
                        ki4Var = new ki4(3, ki4Var3, new c97(y67Var, 4));
                    } else if (a.equals(cm9.a(Field.class))) {
                        ki4Var = new ki4(3, ki4Var3, new c97(y67Var, 5));
                    } else {
                        xk5.p(ki4Var3, "Unsupported member type: ");
                        return null;
                    }
                    return g9a.e0(ki4Var);
                }
                int i = b86.a;
                int i2 = b86.a;
                throw null;
            case 20:
                Class cls2 = (Class) obj;
                zb4 zb4Var = (zb4) this.c;
                final y67 y67Var2 = (y67) this.b;
                y67Var2.getClass();
                try {
                    gs9Var2 = b00.D0(cls2.getDeclaredFields());
                } catch (Throwable th4) {
                    gs9Var2 = new gs9(th4);
                }
                if (hs9.a(gs9Var2) == null) {
                    if (gs9Var2 instanceof gs9) {
                        gs9Var2 = null;
                    }
                    Object obj4 = (List) gs9Var2;
                    if (obj4 == null) {
                        obj4 = ks3.a;
                    }
                    ki4 ki4Var4 = new ki4(3, e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(e97.Y(new ki4(3, e97.a(new c00(obj4, 1), zb4Var, y67Var2), b97.a), y67Var2, "isEnumConstant", null, new Object()), y67Var2, "isEnumConstantNot", null, new Object()), y67Var2, "type", null, new lu4() { // from class: c77
                        @Override // defpackage.lu4
                        public final Object invoke(Object obj5, Object obj6) {
                            return Boolean.valueOf(e97.U(y67.this, obj5, (FieldAccessor) obj6));
                        }
                    }), y67Var2, "typeCondition", null, new Object()), y67Var2, "genericType", null, new Object()), y67Var2, "genericTypeCondition", null, new Object()), new Object());
                    gi1 a2 = cm9.a(Field.class);
                    if (a2.equals(cm9.a(Method.class))) {
                        ki4Var2 = new ki4(3, ki4Var4, new c97(y67Var2, 0));
                    } else if (a2.equals(cm9.a(Constructor.class))) {
                        ki4Var2 = new ki4(3, ki4Var4, new c97(y67Var2, 1));
                    } else if (a2.equals(cm9.a(Field.class))) {
                        ki4Var2 = new ki4(3, ki4Var4, new c97(y67Var2, 2));
                    } else {
                        xk5.p(ki4Var4, "Unsupported member type: ");
                        return null;
                    }
                    return g9a.e0(ki4Var2);
                }
                int i3 = b86.a;
                int i4 = b86.a;
                throw null;
            case 21:
                return ((ww6) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 22:
                return ((ww6) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 23:
                int intValue5 = ((Number) obj).intValue();
                return ((j35) this.c).invoke(Integer.valueOf(intValue5), ((List) this.b).get(intValue5));
            case 24:
                int intValue6 = ((Number) obj).intValue();
                return ((j35) this.c).invoke(Integer.valueOf(intValue6), ((List) this.b).get(intValue6));
            case 25:
                return ((ww6) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 26:
                return ((ww6) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            case 27:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                f76 f76Var = (f76) this.c;
                aw7 aw7Var = (aw7) this.b;
                if (booleanValue) {
                    l0 = sl1.o0(sl1.E0((List) aw7Var.getValue()), f76Var);
                } else {
                    l0 = sl1.l0(sl1.E0((List) aw7Var.getValue()), f76Var);
                }
                aw7Var.setValue(l0);
                return pvc.a;
            case 28:
                return ((ww6) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
            default:
                return ((si7) this.c).invoke(((List) this.b).get(((Number) obj).intValue()));
        }
    }
}
