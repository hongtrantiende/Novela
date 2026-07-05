package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tg5  reason: default package */
/* loaded from: classes3.dex */
public abstract class tg5 {
    public static final Set a = b00.F0(new Character[]{'/', '?', '#', '@'});

    static {
        List list = no6.b;
        sve.j(tl1.B("HTTP/1.0", "HTTP/1.1"), new y4(22), new c8(3, (byte) 0));
    }

    public static final void a(vb1 vb1Var, char c) {
        throw new bj1("Character with code " + (c & 255) + " is not allowed in header names, \n" + ((Object) vb1Var), 3);
    }

    public static final int b(vb1 vb1Var, vf9 vf9Var) {
        int i = vf9Var.c;
        for (int i2 = vf9Var.b; i2 < i; i2++) {
            char charAt = vb1Var.charAt(i2);
            if (charAt == ':' && i2 != vf9Var.b) {
                vf9Var.b = i2 + 1;
                return i2;
            } else if (c16.l(charAt, 32) <= 0 || k4b.W("\"(),/:;<=>?@[\\]{}", charAt)) {
                int i3 = vf9Var.b;
                if (charAt != ':') {
                    if (i2 == i3) {
                        throw new bj1("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.", 3);
                    }
                    a(vb1Var, charAt);
                    throw null;
                }
                throw new bj1("Empty header names are not allowed as per RFC7230.", 3);
            }
        }
        CharSequence subSequence = vb1Var.subSequence(vf9Var.b, vf9Var.c);
        throw new bj1("No colon in HTTP header in " + subSequence.toString() + " in builder: \n" + ((Object) vb1Var), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b4, code lost:
        a(r5, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002a, B:23:0x005f, B:25:0x006b, B:27:0x006f, B:31:0x007c, B:34:0x0088, B:37:0x0094, B:39:0x0099, B:55:0x00c1, B:19:0x0048, B:42:0x00a0, B:51:0x00b4, B:52:0x00b7, B:53:0x00b8, B:54:0x00bb, B:56:0x00cc, B:57:0x00d3, B:58:0x00d4, B:60:0x00dc), top: B:64:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002a, B:23:0x005f, B:25:0x006b, B:27:0x006f, B:31:0x007c, B:34:0x0088, B:37:0x0094, B:39:0x0099, B:55:0x00c1, B:19:0x0048, B:42:0x00a0, B:51:0x00b4, B:52:0x00b7, B:53:0x00b8, B:54:0x00bb, B:56:0x00cc, B:57:0x00d3, B:58:0x00d4, B:60:0x00dc), top: B:64:0x002a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005c -> B:23:0x005f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.s11 r12, defpackage.vb1 r13, defpackage.vf9 r14, defpackage.n42 r15) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg5.c(s11, vb1, vf9, n42):java.lang.Object");
    }

    public static final void d(tb1 tb1Var) {
        if (!k4b.Z(tb1Var, ":")) {
            for (int i = 0; i < tb1Var.length(); i++) {
                Character valueOf = Character.valueOf(tb1Var.charAt(i));
                Set set = a;
                if (set.contains(valueOf)) {
                    throw new bj1("Host cannot contain any of the following symbols: " + set, 3);
                }
            }
            return;
        }
        throw new bj1("Host header with ':' should contains port: " + ((Object) tb1Var), 3);
    }
}
