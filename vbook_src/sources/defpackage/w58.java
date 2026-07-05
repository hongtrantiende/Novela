package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w58  reason: default package */
/* loaded from: classes3.dex */
public final class w58 extends n42 {
    public p40 C;
    public /* synthetic */ Object D;
    public final /* synthetic */ fp1 E;
    public int F;
    public sm2 a;
    public Iterator b;
    public String c;
    public fp1 d;
    public String e;
    public String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w58(fp1 fp1Var, n42 n42Var) {
        super(n42Var);
        this.E = fp1Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.D = obj;
        this.F |= Integer.MIN_VALUE;
        return this.E.i(null, null, this);
    }
}
