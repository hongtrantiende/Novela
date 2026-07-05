package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m19  reason: default package */
/* loaded from: classes3.dex */
public final class m19 extends f3 {
    public final gi1 a;
    public final ye6 b;

    public m19(gi1 gi1Var) {
        gi1Var.getClass();
        this.a = gi1Var;
        this.b = ipe.x(sk6.b, new u76(this, 24));
    }

    @Override // defpackage.s76
    public final o9a e() {
        return (o9a) this.b.getValue();
    }

    @Override // defpackage.f3
    public final gi1 h() {
        return this.a;
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }
}
