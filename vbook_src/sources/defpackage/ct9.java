package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ct9  reason: default package */
/* loaded from: classes3.dex */
public final class ct9 extends y1 {
    public int c;
    public int d;
    public final /* synthetic */ dt9 e;

    public ct9(dt9 dt9Var) {
        this.e = dt9Var;
        this.c = dt9Var.d;
        this.d = dt9Var.c;
    }

    @Override // defpackage.y1
    public final void a() {
        int i = this.c;
        if (i == 0) {
            this.a = 2;
            return;
        }
        dt9 dt9Var = this.e;
        Object[] objArr = dt9Var.a;
        int i2 = this.d;
        this.b = objArr[i2];
        this.a = 1;
        this.d = (i2 + 1) % dt9Var.b;
        this.c = i - 1;
    }
}
