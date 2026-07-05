package defpackage;

import android.text.TextUtils;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bid  reason: default package */
/* loaded from: classes.dex */
public final class bid implements r94 {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final lac b;
    public final m8b d;
    public final boolean e;
    public t94 f;
    public int h;
    public final km8 c = new km8();
    public byte[] g = new byte[1024];

    public bid(String str, lac lacVar, m8b m8bVar, boolean z) {
        this.a = str;
        this.b = lacVar;
        this.d = m8bVar;
        this.e = z;
    }

    @Override // defpackage.r94
    public final int b(s94 s94Var, fr2 fr2Var) {
        String n;
        int length;
        this.f.getClass();
        int length2 = (int) s94Var.getLength();
        int i2 = this.h;
        byte[] bArr = this.g;
        if (i2 == bArr.length) {
            if (length2 != -1) {
                length = length2;
            } else {
                length = bArr.length;
            }
            this.g = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.g;
        int i3 = this.h;
        int read = s94Var.read(bArr2, i3, bArr2.length - i3);
        if (read != -1) {
            int i4 = this.h + read;
            this.h = i4;
            if (length2 == -1 || i4 != length2) {
                return 0;
            }
        }
        km8 km8Var = new km8(this.g);
        did.d(km8Var);
        String n2 = km8Var.n(StandardCharsets.UTF_8);
        long j2 = 0;
        long j3 = 0;
        while (true) {
            Matcher matcher = null;
            if (!TextUtils.isEmpty(n2)) {
                if (n2.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = i.matcher(n2);
                    if (matcher2.find()) {
                        Matcher matcher3 = j.matcher(n2);
                        if (matcher3.find()) {
                            String group = matcher2.group(1);
                            group.getClass();
                            j3 = did.c(group);
                            String group2 = matcher3.group(1);
                            group2.getClass();
                            long parseLong = Long.parseLong(group2);
                            String str = a2d.a;
                            j2 = a2d.Y(parseLong, 1000000L, 90000L, RoundingMode.DOWN);
                        } else {
                            throw xm8.a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(n2));
                        }
                    } else {
                        throw xm8.a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(n2));
                    }
                }
                n2 = km8Var.n(StandardCharsets.UTF_8);
            } else {
                while (true) {
                    String n3 = km8Var.n(StandardCharsets.UTF_8);
                    if (n3 == null) {
                        break;
                    } else if (did.a.matcher(n3).matches()) {
                        do {
                            n = km8Var.n(StandardCharsets.UTF_8);
                            if (n != null) {
                            }
                        } while (!n.isEmpty());
                    } else {
                        Matcher matcher4 = aid.a.matcher(n3);
                        if (matcher4.matches()) {
                            matcher = matcher4;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    g(0L);
                    return -1;
                }
                String group3 = matcher.group(1);
                group3.getClass();
                long c = did.c(group3);
                String str2 = a2d.a;
                long b = this.b.b(a2d.Y((j2 + c) - j3, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                fjc g = g(b - c);
                byte[] bArr3 = this.g;
                int i5 = this.h;
                km8 km8Var2 = this.c;
                km8Var2.K(bArr3, i5);
                g.e(this.h, km8Var2);
                g.a(b, 1, this.h, 0, null);
                return -1;
            }
        }
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        tt2 tt2Var = (tt2) s94Var;
        tt2Var.f(this.g, 0, 6, false);
        byte[] bArr = this.g;
        km8 km8Var = this.c;
        km8Var.K(bArr, 6);
        if (did.a(km8Var)) {
            return true;
        }
        tt2Var.f(this.g, 6, 3, false);
        km8Var.K(this.g, 9);
        return did.a(km8Var);
    }

    @Override // defpackage.r94
    public final void d(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        if (this.e) {
            t94Var = new o40(t94Var, this.d);
        }
        this.f = t94Var;
        t94Var.v(new ge0(-9223372036854775807L));
    }

    public final fjc g(long j2) {
        fjc s = this.f.s(0, 3);
        uq4 uq4Var = new uq4();
        uq4Var.n = lc7.p("text/vtt");
        uq4Var.d = this.a;
        uq4Var.s = j2;
        eub.t(uq4Var, s);
        this.f.m();
        return s;
    }

    @Override // defpackage.r94
    public final void a() {
    }
}
