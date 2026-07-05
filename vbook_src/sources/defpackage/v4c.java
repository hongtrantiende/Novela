package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v4c  reason: default package */
/* loaded from: classes3.dex */
public final class v4c extends n42 {
    public String a;
    public y5c b;
    public ArrayList c;
    public /* synthetic */ Object d;
    public final /* synthetic */ y5c e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4c(y5c y5cVar, n42 n42Var) {
        super(n42Var);
        this.e = y5cVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.h0(null, this);
    }
}
