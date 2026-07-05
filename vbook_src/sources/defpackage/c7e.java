package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c7e  reason: default package */
/* loaded from: classes.dex */
public final class c7e extends o3 {
    public static final Parcelable.Creator<c7e> CREATOR = new u7e(1);
    public static final byte[] b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] a;

    public c7e(byte[][] bArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (bArr != null) {
            z = true;
        } else {
            z = false;
        }
        am8.n(z);
        if (1 != ((bArr.length & 1) ^ 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        am8.n(z2);
        for (int i = 0; i < bArr.length; i += 2) {
            if (i == 0 || bArr[i] != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            am8.n(z3);
            int i2 = i + 1;
            if (bArr[i2] != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            am8.n(z4);
            int length = bArr[i2].length;
            if (length == 32 || length == 64) {
                z5 = true;
            } else {
                z5 = false;
            }
            am8.n(z5);
        }
        this.a = bArr;
    }

    public static c7e c(JSONObject jSONObject, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z) {
                    arrayList.add(f(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(g(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(jye.k(next));
                    if (z) {
                        arrayList.add(f(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(g(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new c7e((byte[][]) arrayList.toArray(new byte[0]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject d(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] e(byte[] r7) {
        /*
            int r0 = defpackage.xme.a
            jne r0 = defpackage.ume.a
            int r1 = r0.L
            java.security.MessageDigest r2 = r0.K
            boolean r0 = r0.M
            r3 = 0
            if (r0 == 0) goto L19
            b50 r0 = new b50     // Catch: java.lang.CloneNotSupportedException -> L19
            java.lang.Object r4 = r2.clone()     // Catch: java.lang.CloneNotSupportedException -> L19
            java.security.MessageDigest r4 = (java.security.MessageDigest) r4     // Catch: java.lang.CloneNotSupportedException -> L19
            r0.<init>(r4, r1)     // Catch: java.lang.CloneNotSupportedException -> L19
            goto L26
        L19:
            b50 r0 = new b50
            java.lang.String r2 = r2.getAlgorithm()
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.security.NoSuchAlgorithmException -> L80
            r0.<init>(r2, r1)
        L26:
            java.lang.Object r1 = r0.c
            java.security.MessageDigest r1 = (java.security.MessageDigest) r1
            byte[] r2 = defpackage.c7e.b
            r2.getClass()
            int r4 = r2.length
            boolean r5 = r0.a
            java.lang.String r6 = "Cannot re-use a Hasher after calling hash() on it"
            if (r5 != 0) goto L7c
            r5 = 0
            r1.update(r2, r5, r4)
            r7.getClass()
            int r2 = r7.length
            boolean r4 = r0.a
            if (r4 != 0) goto L78
            r1.update(r7, r5, r2)
            boolean r7 = r0.a
            if (r7 != 0) goto L74
            r7 = 1
            r0.a = r7
            int r7 = r0.b
            int r0 = r1.getDigestLength()
            if (r7 != r0) goto L5e
            byte[] r7 = r1.digest()
            mme r0 = new mme
            r0.<init>(r7)
            goto L6b
        L5e:
            byte[] r0 = r1.digest()
            byte[] r7 = java.util.Arrays.copyOf(r0, r7)
            mme r0 = new mme
            r0.<init>(r7)
        L6b:
            byte[] r7 = r0.b
            java.lang.Object r7 = r7.clone()
            byte[] r7 = (byte[]) r7
            return r7
        L74:
            defpackage.vs.k(r6)
            return r3
        L78:
            defpackage.vs.k(r6)
            return r3
        L7c:
            defpackage.vs.k(r6)
            return r3
        L80:
            r7 = move-exception
            defpackage.vs.j(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c7e.e(byte[]):byte[]");
    }

    public static byte[] f(JSONObject jSONObject) {
        byte[] k = jye.k(jSONObject.getString("first"));
        if (k.length == 32) {
            if (!jSONObject.has("second")) {
                return k;
            }
            byte[] k2 = jye.k(jSONObject.getString("second"));
            if (k2.length == 32) {
                return vae.q(k, k2);
            }
            throw new JSONException("hashed PRF value with wrong length");
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] g(JSONObject jSONObject) {
        byte[] e = e(jye.k(jSONObject.getString("first")));
        if (!jSONObject.has("second")) {
            return e;
        }
        return vae.q(e, e(jye.k(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c7e)) {
            return false;
        }
        return Arrays.deepEquals(this.a, ((c7e) obj).a);
    }

    public final int hashCode() {
        byte[][] bArr;
        int i = 0;
        for (byte[] bArr2 : this.a) {
            if (bArr2 != null) {
                i ^= Arrays.hashCode(new Object[]{bArr2});
            }
        }
        return i;
    }

    public final String toString() {
        byte[][] bArr = this.a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i = 0; i < bArr.length; i += 2) {
                if (bArr[i] == null) {
                    jSONObject.put("eval", d(bArr[i + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(jye.l(bArr[i]), d(bArr[i + 1]));
                }
            }
            String obj = jSONObject.toString();
            return "PrfExtension{" + obj + "}";
        } catch (JSONException e) {
            return hl5.n("PrfExtension{Exception:", e.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.J(parcel, 1, this.a);
        uue.V(parcel, U);
    }
}
