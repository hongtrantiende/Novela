package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p64  reason: default package */
/* loaded from: classes3.dex */
public final class p64 extends n42 {
    public ArrayList a;
    public q36 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ c74 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p64(c74 c74Var, n42 n42Var) {
        super(n42Var);
        this.d = c74Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(null, this);
    }
}
