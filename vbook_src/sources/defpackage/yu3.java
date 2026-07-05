package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yu3  reason: default package */
/* loaded from: classes3.dex */
public final class yu3 extends aab implements lu4 {
    public hn8 C;
    public hn8 D;
    public hn8 E;
    public Object F;
    public xu3 G;
    public xl9 H;
    public List I;
    public List J;
    public List K;
    public String L;
    public Object M;
    public Object N;
    public Object O;
    public Object P;
    public zu3 Q;
    public lj9 R;
    public long S;
    public int T;
    public int U;
    public /* synthetic */ Object V;
    public final /* synthetic */ zu3 W;
    public final /* synthetic */ String X;
    public final /* synthetic */ w14 Y;
    public hk2 a;
    public Object b;
    public Object c;
    public Object d;
    public hn8 e;
    public hn8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu3(zu3 zu3Var, String str, w14 w14Var, m42 m42Var) {
        super(2, m42Var);
        this.W = zu3Var;
        this.X = str;
        this.Y = w14Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        yu3 yu3Var = new yu3(this.W, this.X, this.Y, m42Var);
        yu3Var.V = obj;
        return yu3Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((yu3) create((tj4) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:678:0x176d
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // defpackage.hh0
    public final java.lang.Object invokeSuspend(java.lang.Object r73) {
        /*
            Method dump skipped, instructions count: 7854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yu3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
