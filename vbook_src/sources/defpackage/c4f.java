package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c4f  reason: default package */
/* loaded from: classes.dex */
public final class c4f extends s9e {
    public final t6f f;

    public c4f(t6f t6fVar) {
        int i = g4f.b[a82.C(t6fVar.b)];
        this.f = t6fVar;
    }

    @Override // defpackage.s9e
    public final bfe B() {
        t6f t6fVar = this.f;
        return new b4f((String) t6fVar.c, (eif) t6fVar.f);
    }

    @Override // defpackage.s9e
    public final Integer C() {
        return (Integer) this.f.C;
    }

    public final hlf D() {
        t6f t6fVar = this.f;
        Integer num = (Integer) t6fVar.C;
        eif eifVar = (eif) t6fVar.f;
        if (((eif) t6fVar.f).equals(eif.RAW)) {
            return hlf.a(new byte[0]);
        }
        if (eifVar.equals(eif.TINK)) {
            return o5f.b(num.intValue());
        }
        if (!eifVar.equals(eif.LEGACY) && !eifVar.equals(eif.CRUNCHY)) {
            hfd.j("Unknown output prefix type");
            return null;
        }
        return o5f.a(num.intValue());
    }
}
