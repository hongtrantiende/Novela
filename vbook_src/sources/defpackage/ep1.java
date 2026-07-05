package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ep1  reason: default package */
/* loaded from: classes3.dex */
public final class ep1 extends n42 {
    public int C;
    public pta a;
    public List b;
    public ArrayList c;
    public Iterator d;
    public /* synthetic */ Object e;
    public final /* synthetic */ fp1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep1(fp1 fp1Var, n42 n42Var) {
        super(n42Var);
        this.f = fp1Var;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.C |= Integer.MIN_VALUE;
        return this.f.k(this, null, null);
    }
}
