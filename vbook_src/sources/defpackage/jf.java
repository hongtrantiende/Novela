package defpackage;

import android.graphics.Bitmap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jf  reason: default package */
/* loaded from: classes3.dex */
public final class jf extends n42 {
    public String a;
    public Bitmap b;
    public o48 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ kf e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(kf kfVar, n42 n42Var) {
        super(n42Var);
        this.e = kfVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, null, null, 0, this);
    }
}
