package defpackage;

import android.os.StatFs;
import j$.time.format.DateTimeFormatterBuilder;
import java.io.File;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tvc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class tvc implements vt4 {
    public final /* synthetic */ int a;

    public /* synthetic */ tvc(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r7v53, types: [b6d, java.lang.Object] */
    @Override // defpackage.vt4
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new gm9("(\\d+(?:[.,]\\d+)*)(?:\\s*(tỷ|triệu|nghìn|ngàn))?([$€¥£₩])", 0);
            case 1:
                return new gm9("(\\d+(?:[.,]\\d+)*)\\s*%", 0);
            case 2:
                return yae.z(Boolean.FALSE);
            case 3:
                return yae.z(Boolean.FALSE);
            case 4:
                return yae.z(Boolean.FALSE);
            case 5:
                return yae.z(Boolean.FALSE);
            case 6:
                return yae.z(Boolean.FALSE);
            case 7:
                return new sz(c4b.a, 0);
            case 8:
                return new sz(c4b.a, 0);
            case 9:
                return new m78("com.reader.app.ui.screen.admin.UserListRoute", e0d.INSTANCE, new Annotation[0]);
            case 10:
                return yae.z(Boolean.FALSE);
            case 11:
                return yae.z(new jub((String) null, 0L, 7));
            case 12:
                g1d g1dVar = new g1d(new hy(0));
                fbe.t(g1dVar, new xt4[]{new svc(14)}, new svc(15));
                return new h1d(g1dVar.build());
            case 13:
                g1d g1dVar2 = new g1d(new hy(0));
                fbe.t(g1dVar2, new xt4[]{new svc(16)}, new svc(17));
                return new h1d(g1dVar2.build());
            case 14:
                hy hyVar = new hy(0);
                lh8 lh8Var = lh8.a;
                hyVar.a(new gla(new ri0(new o1d(lh8Var))));
                hyVar.a(new ri0(new l1d(lh8Var)));
                ArrayList arrayList = hyVar.a;
                arrayList.getClass();
                return new h1d(new f51(arrayList));
            case 15:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
            case 16:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
            case 17:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
            case 18:
                m66 m66Var = pe4.a;
                hn8 e = pe4.b.e("coil3_disk_cache");
                long j = 10485760;
                try {
                    File file = e.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    j = dce.o((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                } catch (Exception unused) {
                }
                return new oj9(j, m66Var, e);
            case 19:
                lh9 lh9Var = lh9.d;
                String w = lh9Var.w("TMPDIR");
                if (w == null) {
                    String w2 = lh9Var.w("TEMP");
                    if (w2 == null) {
                        String w3 = lh9Var.w("TMP");
                        if (w3 == null) {
                            return "/tmp";
                        }
                        return w3;
                    }
                    return w2;
                }
                return w;
            case 20:
                String str = c6d.a;
                str.getClass();
                return d6d.b(str);
            case 21:
                return d6d.a(new h4d(11));
            case 22:
                return d6d.a(new h4d(10));
            case 23:
                String str2 = c6d.a;
                str2.getClass();
                return d6d.b(str2);
            case 24:
                String str3 = c6d.a;
                str3.getClass();
                return d6d.b(str3);
            case 25:
                return d6d.a(new h4d(9));
            case 26:
                return new Object().k();
            case 27:
                String str4 = c6d.a;
                str4.getClass();
                return d6d.b(str4);
            case 28:
                return yae.z(Boolean.FALSE);
            default:
                return yae.z(Boolean.FALSE);
        }
    }
}
