package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jgf  reason: default package */
/* loaded from: classes.dex */
public abstract class jgf {
    public static final ggf d = new Object();
    public final jgf a;
    public final jla b;
    public boolean c = false;

    public /* synthetic */ jgf(jgf jgfVar, jla jlaVar) {
        if (jgfVar != null) {
            wq9.s(jgfVar.c);
        }
        this.a = jgfVar;
        this.b = jlaVar;
    }

    public static jgf a(jgf jgfVar, jgf jgfVar2) {
        boolean z;
        jgfVar.getClass();
        jgf jgfVar3 = igf.e;
        if (jgfVar == jgfVar3) {
            return jgfVar2;
        }
        jgfVar2.getClass();
        if (jgfVar2 == jgfVar3) {
            return jgfVar;
        }
        ts5<jgf> i = ts5.i(2, jgfVar, jgfVar2);
        if (i.isEmpty()) {
            return jgfVar3;
        }
        if (i.size() == 1) {
            return (jgf) i.iterator().next();
        }
        int i2 = 0;
        for (jgf jgfVar4 : i) {
            do {
                i2 += jgfVar4.b.c;
                jgfVar4 = jgfVar4.a;
            } while (jgfVar4 != null);
        }
        if (i2 == 0) {
            return igf.e;
        }
        jla jlaVar = new jla(i2);
        for (jgf jgfVar5 : i) {
            do {
                int i3 = 0;
                while (true) {
                    jla jlaVar2 = jgfVar5.b;
                    if (i3 >= jlaVar2.c) {
                        break;
                    }
                    if (jlaVar.put((ggf) jlaVar2.e(i3), jlaVar2.h(i3)) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    wq9.u(z, "Duplicate bindings: %s", jlaVar2.e(i3));
                    i3++;
                }
                jgfVar5 = jgfVar5.a;
            } while (jgfVar5 != null);
        }
        return new jgf(null, jlaVar).b();
    }

    public final jgf b() {
        if (!this.c) {
            this.c = true;
            jgf jgfVar = this.a;
            if (jgfVar != null && this.b.isEmpty()) {
                return jgfVar;
            }
            return this;
        }
        vs.k("Already frozen");
        return null;
    }

    public final boolean c() {
        if (!this.b.containsKey(d)) {
            jgf jgfVar = this.a;
            if (jgfVar == null || !jgfVar.c()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (jgf jgfVar = this; jgfVar != null; jgfVar = jgfVar.a) {
            for (int i = 0; i < jgfVar.b.c; i++) {
                sb.append("[");
                sb.append(this.b.h(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
