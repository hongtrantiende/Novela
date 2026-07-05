package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i91  reason: default package */
/* loaded from: classes3.dex */
public final class i91 extends aab implements lu4 {
    public k91 C;
    public String D;
    public w14 E;
    public Iterator F;
    public String G;
    public int H;
    public int I;
    public int J;
    public int K;
    public long L;
    public int M;
    public /* synthetic */ Object N;
    public final /* synthetic */ k91 O;
    public final /* synthetic */ String P;
    public final /* synthetic */ w14 Q;
    public hk2 a;
    public List b;
    public hn8 c;
    public hn8 d;
    public hn8 e;
    public Serializable f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i91(k91 k91Var, String str, w14 w14Var, m42 m42Var) {
        super(2, m42Var);
        this.O = k91Var;
        this.P = str;
        this.Q = w14Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        i91 i91Var = new i91(this.O, this.P, this.Q, m42Var);
        i91Var.N = obj;
        return i91Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((i91) create((tj4) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:136:0x04dc
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // defpackage.hh0
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 2308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i91.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
