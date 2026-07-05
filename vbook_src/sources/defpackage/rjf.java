package defpackage;

import java.security.InvalidKeyException;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rjf  reason: default package */
/* loaded from: classes.dex */
public final class rjf {
    public static final byte[] d = new byte[16];
    public static final byte[] e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public static final ro f = new ro(13);
    public final s9f a;
    public final byte[] b;
    public final byte[] c;

    public rjf(byte[] bArr, hlf hlfVar) {
        if (eub.d(1)) {
            if (bArr.length != 32 && bArr.length != 64) {
                throw new InvalidKeyException(hl5.l("invalid key size: ", " bytes; key must have 32 or 64 bytes", bArr.length));
            }
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.a = qre.y(o9f.D(i9f.b(copyOfRange.length), new xk9(hlf.a(copyOfRange), 26)));
            this.c = hlfVar.b();
            return;
        }
        hfd.j("Can not use AES-SIV in FIPS-mode.");
        throw null;
    }
}
