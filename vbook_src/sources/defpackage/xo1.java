package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xo1  reason: default package */
/* loaded from: classes3.dex */
public final class xo1 extends n42 {
    public /* synthetic */ Object C;
    public final /* synthetic */ fp1 D;
    public int E;
    public pta a;
    public sm2 b;
    public ArrayList c;
    public Iterator d;
    public int e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo1(fp1 fp1Var, n42 n42Var) {
        super(n42Var);
        this.D = fp1Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return fp1.a(this.D, null, null, this);
    }
}
