package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gi1  reason: default package */
/* loaded from: classes3.dex */
public final class gi1 implements xh1, u96, x66, t66, w66 {
    public static final Map b;
    public final Class a;

    static {
        List B = tl1.B(vt4.class, xt4.class, lu4.class, mu4.class, nu4.class, ou4.class, pu4.class, qu4.class, ru4.class, su4.class, wt4.class, yt4.class, zt4.class, au4.class, bu4.class, cu4.class, du4.class, eu4.class, fu4.class, gu4.class, iu4.class, ju4.class, ku4.class);
        ArrayList arrayList = new ArrayList(tl1.s(B, 10));
        int i = 0;
        for (Object obj : B) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new yk8((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                tl1.M();
                throw null;
            }
        }
        b = o17.x(arrayList);
    }

    public gi1(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.xh1
    public final Class c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof gi1) && nmd.C(this).equals(nmd.C((gi1) obj))) {
            return true;
        }
        return false;
    }

    public final String f() {
        String p;
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (p = ote.p(componentType.getName())) != null) {
                str = p.concat("Array");
            }
            if (str == null) {
                return "kotlin.Array";
            }
            return str;
        }
        String p2 = ote.p(cls.getName());
        if (p2 == null) {
            return cls.getCanonicalName();
        }
        return p2;
    }

    @Override // defpackage.u96
    public final GenericDeclaration findJavaDeclaration() {
        return this.a;
    }

    public final String g() {
        String y;
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return k4b.D0(simpleName, enclosingMethod.getName() + '$', simpleName);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return k4b.D0(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
            return k4b.C0('$', simpleName, simpleName);
        } else if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (y = ote.y(componentType.getName())) != null) {
                str = y.concat("Array");
            }
            if (str == null) {
                return "Array";
            }
            return str;
        } else {
            String y2 = ote.y(cls.getName());
            if (y2 == null) {
                return cls.getSimpleName();
            }
            return y2;
        }
    }

    public final boolean h(Object obj) {
        Class cls = this.a;
        cls.getClass();
        Map map = b;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return jsc.G(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = nmd.C(cm9.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final int hashCode() {
        return nmd.C(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
