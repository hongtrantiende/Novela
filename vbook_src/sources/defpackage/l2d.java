package defpackage;

import java.util.List;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l2d  reason: default package */
/* loaded from: classes.dex */
public abstract class l2d {
    public static final gm9 a = new gm9("^(?:https?:|mailto:|tel:|#)", 0);

    public static final kw3 a(Throwable th) {
        String message = th.getMessage();
        kw3 kw3Var = kw3.F;
        if (message == null) {
            return kw3Var;
        }
        if (k4b.V(message, "encrypted", true)) {
            return kw3.c;
        }
        if (k4b.V(message, "DRM", false)) {
            return kw3.d;
        }
        if (!k4b.V(message, "ZIP bomb", false) && !k4b.V(message, "ZIP uncompressed size exceeded", false) && !k4b.V(message, "ZIP entry count exceeded", false)) {
            if (!k4b.V(message, "bomb", false) && !k4b.V(message, "uncompressed size exceeded", false)) {
                if (k4b.V(message, "image-based", true)) {
                    return kw3.D;
                }
                if (k4b.V(message, "section", true) && (k4b.V(message, "not found", true) || k4b.V(message, "no section", true))) {
                    return kw3.E;
                }
                if (!k4b.V(message, "signature", true) && !k4b.V(message, "cannot recover", true)) {
                    return kw3Var;
                }
                return kw3.e;
            }
            return kw3.f;
        }
        return kw3.C;
    }

    public static final String b(double d) {
        long rint = (long) Math.rint(d * 10.0d);
        long j = rint / 10;
        long j2 = rint % 10;
        if (j2 < 0) {
            j2 = -j2;
        }
        return j + "." + j2;
    }

    public static final boolean c(String str) {
        str.getClass();
        if (k4b.f0(str, (char) 0, 0, 6) < 0) {
            String replace = str.replace('\\', '/');
            replace.getClass();
            List<String> y0 = k4b.y0(replace, new char[]{'/'}, 0, 6);
            if (!y0.isEmpty()) {
                for (String str2 : y0) {
                    if (c16.i(str2, "..")) {
                        break;
                    }
                }
            }
            if (!r4b.Q(replace, "/", false)) {
                Pattern compile = Pattern.compile("^[A-Za-z]:");
                compile.getClass();
                if (compile.matcher(replace).find()) {
                    break;
                }
                return false;
            }
        }
        return true;
    }

    public static final jqd d(byte[] bArr) {
        bArr.getClass();
        try {
            int length = bArr.length;
            int i = length - 22;
            int max = Math.max(0, length - 65557);
            while (true) {
                if (i >= max) {
                    if (i >= 0 && i + 4 <= length && bbe.A(bArr, i) == 101010256) {
                        break;
                    }
                    i--;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i < 0) {
                return new jqd(0L, 0);
            }
            int z = bbe.z(bArr, i + 10);
            if (z <= 500) {
                long A = bbe.A(bArr, i + 12);
                long A2 = bbe.A(bArr, i + 16);
                long j = A + A2;
                if (j > length) {
                    return new jqd(0L, z);
                }
                int i2 = (int) A2;
                int i3 = (int) j;
                long j2 = 0;
                for (int i4 = 0; i4 < z && i2 + 46 <= i3 && bbe.A(bArr, i2) == 33639248; i4++) {
                    j2 += bbe.A(bArr, i2 + 24);
                    i2 += bbe.z(bArr, i2 + 28) + 46 + bbe.z(bArr, i2 + 30) + bbe.z(bArr, i2 + 32);
                }
                if (j2 <= 104857600) {
                    return new jqd(j2, z);
                }
                throw new Exception("ZIP uncompressed size exceeded: " + b((j2 / 1024.0d) / 1024.0d) + "MB (max 100MB)");
            }
            throw new Exception("ZIP entry count exceeded: " + z + " (max 500)");
        } catch (t96 e) {
            throw e;
        } catch (Throwable unused) {
            return new jqd(0L, 0);
        }
    }

    public static final String e(String str) {
        str.getClass();
        String obj = k4b.N0(str).toString();
        if (obj.length() == 0 || !a.a(obj)) {
            return null;
        }
        return obj;
    }

    public static final String f(String str) {
        Pattern compile = Pattern.compile("<!DOCTYPE\\s[^\\[>]*(\\[[\\s\\S]*?\\])?\\s*>", h88.h(2));
        compile.getClass();
        String replaceAll = compile.matcher(str).replaceAll("");
        replaceAll.getClass();
        return replaceAll;
    }
}
