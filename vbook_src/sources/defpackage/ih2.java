package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ih2  reason: default package */
/* loaded from: classes3.dex */
public final class ih2 extends n42 {
    public di2 a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ di2 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih2(di2 di2Var, n42 n42Var) {
        super(n42Var);
        this.d = di2Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
