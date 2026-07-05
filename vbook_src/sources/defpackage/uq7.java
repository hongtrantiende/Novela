package defpackage;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uq7  reason: default package */
/* loaded from: classes.dex */
public abstract class uq7 implements lq7, kx5 {
    public nx5 a;

    public abstract mq7 b();

    public void c(nx5 nx5Var) {
        Object[] declaredFields = getClass().getDeclaredFields();
        kn4 kn4Var = new kn4(8);
        declaredFields.getClass();
        if (declaredFields.length != 0) {
            declaredFields = Arrays.copyOf(declaredFields, declaredFields.length);
            if (declaredFields.length > 1) {
                Arrays.sort(declaredFields, kn4Var);
            }
        }
        List asList = Arrays.asList(declaredFields);
        asList.getClass();
        int size = asList.size();
        for (int i = 0; i < size; i++) {
            Field field = (Field) asList.get(i);
            if (!field.getDeclaringClass().isAssignableFrom(uq7.class)) {
                try {
                    field.setAccessible(true);
                    nx5Var.b.b(field.get(this), field.getName());
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }

    public abstract void d(mq7 mq7Var);

    @Override // defpackage.kx5
    public final Object g() {
        nx5 nx5Var = this.a;
        if (nx5Var == null) {
            nx5Var = new nx5();
            cm9.a(getClass()).g();
            c(nx5Var);
            this.a = nx5Var;
        }
        return nx5Var.a;
    }
}
