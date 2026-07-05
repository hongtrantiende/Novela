package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wu9  reason: default package */
/* loaded from: classes.dex */
public final class wu9 implements q09 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public wu9(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.q09
    public final long a(float f, float f2) {
        float f3 = f + this.a;
        float f4 = this.b;
        return wi4.a(f3 / f4, (f2 + this.c) / f4);
    }
}
