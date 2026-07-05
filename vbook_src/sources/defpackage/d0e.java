package defpackage;

import java.util.HashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d0e  reason: default package */
/* loaded from: classes.dex */
public final class d0e extends f5f {
    public Long C;
    public Long D;
    public String d;
    public HashSet e;
    public yz f;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:150:0x0303
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final java.util.ArrayList b0(java.lang.String r41, java.util.List r42, java.util.List r43, java.lang.Long r44, java.lang.Long r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 2789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d0e.b0(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    public final gjf c0(Integer num) {
        if (this.f.containsKey(num)) {
            return (gjf) this.f.get(num);
        }
        gjf gjfVar = new gjf(this, this.d);
        this.f.put(num, gjfVar);
        return gjfVar;
    }

    @Override // defpackage.f5f
    public final void a0() {
    }
}
