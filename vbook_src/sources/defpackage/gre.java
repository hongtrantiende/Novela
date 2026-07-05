package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gre  reason: default package */
/* loaded from: classes.dex */
public final class gre extends cse {
    public final qpe a;

    public gre(qpe qpeVar) {
        this.a = qpeVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        cse cseVar = (cse) obj;
        int zza = cseVar.zza();
        int c = cse.c((byte) 64);
        if (c != zza) {
            return c - cseVar.zza();
        }
        qpe qpeVar = ((gre) cseVar).a;
        qpe qpeVar2 = this.a;
        byte[] bArr = qpeVar2.b;
        int length = bArr.length;
        byte[] bArr2 = qpeVar.b;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        return uoe.a.compare(qpeVar2.i(), qpeVar.i());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gre.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((gre) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(cse.c((byte) 64)), this.a});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        mne mneVar;
        int i;
        boolean z;
        qne qneVar = xne.d;
        xne xneVar = qneVar.c;
        if (xneVar == null) {
            mne mneVar2 = qneVar.a;
            char[] cArr = mneVar2.b;
            int i2 = 0;
            while (true) {
                if (i2 < cArr.length) {
                    char c = cArr[i2];
                    if (c >= 'a' && c <= 'z') {
                        int i3 = 0;
                        while (true) {
                            if (i3 < cArr.length) {
                                char c2 = cArr[i3];
                                if (c2 >= 'A' && c2 <= 'Z') {
                                    z = true;
                                    break;
                                }
                                i3++;
                            } else {
                                z = false;
                                break;
                            }
                        }
                        if (!z) {
                            char[] cArr2 = new char[cArr.length];
                            for (int i4 = 0; i4 < cArr.length; i4++) {
                                char c3 = cArr[i4];
                                if (c3 >= 97 && c3 <= 122) {
                                    c3 ^= 32;
                                }
                                cArr2[i4] = (char) c3;
                            }
                            mneVar = new mne(mneVar2.a.concat(".upperCase()"), cArr2);
                            byte[] bArr = mneVar.g;
                            if (mneVar2.h && !mneVar.h) {
                                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                                for (i = 65; i <= 90; i++) {
                                    int i5 = i | 32;
                                    byte b = bArr[i];
                                    byte b2 = bArr[i5];
                                    if (b == -1) {
                                        copyOf[i] = b2;
                                    } else {
                                        char c4 = (char) i;
                                        char c5 = (char) i5;
                                        if (b2 == -1) {
                                            copyOf[i5] = b;
                                        } else {
                                            vs.k(sxd.p("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c4), Character.valueOf(c5)));
                                            return null;
                                        }
                                    }
                                }
                                mneVar = new mne(mneVar.a.concat(".ignoreCase()"), mneVar.b, copyOf, true);
                            }
                        } else {
                            vs.k("Cannot call upperCase() on a mixed-case alphabet");
                            return null;
                        }
                    } else {
                        i2++;
                    }
                } else {
                    mneVar = mneVar2;
                    break;
                }
            }
            if (mneVar == mneVar2) {
                xneVar = qneVar;
            } else {
                xneVar = new qne(mneVar);
            }
            qneVar.c = xneVar;
        }
        byte[] i6 = this.a.i();
        return hl5.n("h'", xneVar.c(i6, i6.length), "'");
    }

    @Override // defpackage.cse
    public final int zza() {
        return cse.c((byte) 64);
    }
}
