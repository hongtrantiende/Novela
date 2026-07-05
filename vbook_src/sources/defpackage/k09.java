package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k09  reason: default package */
/* loaded from: classes.dex */
public final class k09 extends kr4 {
    public final z9c c;

    public k09(aac aacVar) {
        super(aacVar);
        this.c = new z9c();
    }

    @Override // defpackage.kr4, defpackage.aac
    public final y9c f(int i, y9c y9cVar, boolean z) {
        aac aacVar = this.b;
        y9c f = aacVar.f(i, y9cVar, z);
        if (aacVar.m(f.c, this.c, 0L).a()) {
            f.h(y9cVar.a, y9cVar.b, y9cVar.c, y9cVar.d, y9cVar.e, c7.c, true);
            return f;
        }
        f.f = true;
        return f;
    }
}
