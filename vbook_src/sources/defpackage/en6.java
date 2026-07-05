package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: en6  reason: default package */
/* loaded from: classes3.dex */
public final class en6 implements dn6 {
    public final dx a;
    public final mfb b = new mfb(new u76(this, 4));

    static {
        r76[] r76VarArr = dx.W;
    }

    public en6(dx dxVar) {
        this.a = dxVar;
    }

    public final void a(int i) {
        this.a.Q.e(dx.W[42], Integer.valueOf(i));
        bw7 c = c();
        while (true) {
            cza czaVar = (cza) c;
            Object value = czaVar.getValue();
            int i2 = i;
            if (czaVar.l(value, oia.a((oia) value, 0, 0, 0, 0, i2, false, false, false, 239))) {
                return;
            }
            i = i2;
        }
    }

    public final jj9 b() {
        return z1d.q(c());
    }

    public final bw7 c() {
        return (bw7) this.b.getValue();
    }
}
