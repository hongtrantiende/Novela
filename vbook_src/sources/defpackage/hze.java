package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hze  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hze implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ lxe c;

    public /* synthetic */ hze(boolean z, String str, lxe lxeVar) {
        this.a = z;
        this.b = str;
        this.c = lxeVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        MessageDigest messageDigest;
        boolean z = this.a;
        String str2 = this.b;
        lxe lxeVar = this.c;
        if (!z && x3f.b(str2, lxeVar, true, false).a) {
            str = "debug cert rejected";
        } else {
            str = "not allowed";
        }
        int i = 0;
        while (true) {
            if (i < 2) {
                try {
                    messageDigest = MessageDigest.getInstance("SHA-256");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i++;
            } else {
                messageDigest = null;
                break;
            }
        }
        am8.s(messageDigest);
        byte[] digest = messageDigest.digest(lxeVar.c);
        int length = digest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : digest) {
            char[] cArr2 = jxe.f;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            i2 += 2;
        }
        return str + ": pkg=" + str2 + ", sha256=" + new String(cArr) + ", atk=" + z + ", ver=12451000.false";
    }
}
