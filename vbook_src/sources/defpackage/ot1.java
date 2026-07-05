package defpackage;

import java.util.Collections;
import java.util.HashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ot1  reason: default package */
/* loaded from: classes.dex */
public final class ot1 {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public int d;
    public int e;
    public hu1 f;
    public final HashSet g;

    public ot1(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(mf9.a(cls));
        for (Class cls2 : clsArr) {
            oc2.v(cls2, "Null interface");
            this.b.add(mf9.a(cls2));
        }
    }

    public final void a(x13 x13Var) {
        if (!this.b.contains(x13Var.a)) {
            this.c.add(x13Var);
        } else {
            vs.m("Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    public final pt1 b() {
        boolean z;
        if (this.f != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new pt1(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }
        vs.k("Missing required property: factory.");
        return null;
    }

    public final void c(int i) {
        boolean z;
        if (this.d == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.d = i;
        } else {
            vs.k("Instantiation type has already been set.");
        }
    }

    public ot1(mf9 mf9Var, mf9[] mf9VarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(mf9Var);
        for (mf9 mf9Var2 : mf9VarArr) {
            oc2.v(mf9Var2, "Null interface");
        }
        Collections.addAll(this.b, mf9VarArr);
    }
}
