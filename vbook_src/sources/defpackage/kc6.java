package defpackage;

import android.media.ImageReader;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kc6  reason: default package */
/* loaded from: classes.dex */
public final class kc6 extends n42 {
    public ImageReader a;
    public /* synthetic */ Object b;
    public final /* synthetic */ j55 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc6(j55 j55Var, n42 n42Var) {
        super(n42Var);
        this.c = j55Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.i(null, this);
    }
}
