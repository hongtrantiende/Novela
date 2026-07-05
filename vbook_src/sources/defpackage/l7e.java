package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l7e  reason: default package */
/* loaded from: classes.dex */
public abstract class l7e implements Cloneable {
    public final m7e a;
    public m7e b;

    public l7e(m7e m7eVar) {
        this.a = m7eVar;
        if (!m7eVar.s()) {
            this.b = m7eVar.p();
        } else {
            vs.m("Default instance must be immutable.");
            throw null;
        }
    }

    public static void a(Object obj, Object obj2) {
        m8e m8eVar = m8e.c;
        m8eVar.getClass();
        m8eVar.a(obj.getClass()).h(obj, obj2);
    }

    public final m7e b() {
        boolean s = this.b.s();
        m7e m7eVar = this.b;
        if (s) {
            m7eVar.q();
            m7eVar = this.b;
        }
        m7eVar.getClass();
        if (m7e.n(m7eVar, true)) {
            return m7eVar;
        }
        throw new w8e();
    }

    public final void c() {
        if (!this.b.s()) {
            d();
        }
    }

    public final Object clone() {
        l7e l7eVar = (l7e) this.a.d(5);
        boolean s = this.b.s();
        m7e m7eVar = this.b;
        if (s) {
            m7eVar.q();
            m7eVar = this.b;
        }
        l7eVar.b = m7eVar;
        return l7eVar;
    }

    public final void d() {
        m7e p = this.a.p();
        a(p, this.b);
        this.b = p;
    }
}
