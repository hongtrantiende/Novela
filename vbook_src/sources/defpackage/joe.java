package defpackage;

import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: joe  reason: default package */
/* loaded from: classes.dex */
public final class joe extends fne {
    public String C;
    public long D;
    public final long E;
    public final long F;
    public List G;
    public String H;
    public final String I;
    public int J;
    public String K;
    public String L;
    public long M;
    public String N;
    public String c;
    public String d;
    public int e;
    public String f;

    public joe(lte lteVar, long j, long j2, String str) {
        super(lteVar);
        this.M = 0L;
        this.N = null;
        this.E = j;
        this.F = j2;
        this.I = str;
    }

    @Override // defpackage.fne
    public final boolean a0() {
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:52:0x016b
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final defpackage.d8f b0(java.lang.String r51) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.joe.b0(java.lang.String):d8f");
    }

    public final void c0() {
        String format;
        String str;
        W();
        lte lteVar = (lte) this.a;
        dre dreVar = lteVar.e;
        ppe ppeVar = lteVar.f;
        lte.k(dreVar);
        if (!dreVar.e0().i(dwe.ANALYTICS_STORAGE)) {
            lte.m(ppeVar);
            ppeVar.I.e("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            l6f l6fVar = lteVar.E;
            lte.k(l6fVar);
            l6fVar.X0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        lte.m(ppeVar);
        s56 s56Var = ppeVar.I;
        if (format == null) {
            str = "null";
        } else {
            str = "not null";
        }
        s56Var.e("Resetting session stitching token to ".concat(str));
        this.L = format;
        lteVar.G.getClass();
        this.M = System.currentTimeMillis();
    }

    public final String d0() {
        Y();
        am8.s(this.c);
        return this.c;
    }

    public final String e0() {
        W();
        Y();
        am8.s(this.K);
        return this.K;
    }
}
