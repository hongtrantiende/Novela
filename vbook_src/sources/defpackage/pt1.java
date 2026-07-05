package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pt1  reason: default package */
/* loaded from: classes.dex */
public final class pt1 {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final hu1 f;
    public final Set g;

    public pt1(String str, Set set, Set set2, int i, int i2, hu1 hu1Var, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = hu1Var;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static ot1 a(mf9 mf9Var) {
        return new ot1(mf9Var, new mf9[0]);
    }

    public static ot1 b(Class cls) {
        return new ot1(cls, new Class[0]);
    }

    public static pt1 c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(mf9.a(cls));
        for (Class cls2 : clsArr) {
            oc2.v(cls2, "Null interface");
            hashSet.add(mf9.a(cls2));
        }
        return new pt1(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new nt1(obj, 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
