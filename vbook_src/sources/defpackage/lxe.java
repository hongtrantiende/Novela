package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lxe  reason: default package */
/* loaded from: classes.dex */
public final class lxe extends eve {
    public final byte[] c;

    public lxe(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.c = bArr;
    }

    @Override // defpackage.eve
    public final byte[] T() {
        return this.c;
    }
}
