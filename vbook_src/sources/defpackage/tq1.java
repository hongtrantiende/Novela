package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tq1  reason: default package */
/* loaded from: classes.dex */
public abstract class tq1 {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Can't wrap try/catch for region: R(68:1|(3:2|3|(1:5))|197|7|8|(3:173|174|(67:176|(60:178|(1:180)|11|(1:13)|14|(1:16)|17|(51:19|(1:159)|23|(1:25)|26|(1:28)(2:149|(1:154)(1:153))|29|(1:31)|32|(1:34)(5:137|(1:139)|140|(1:142)(1:148)|(1:144)(2:145|(1:147)))|35|(1:37)(6:119|(4:122|(2:130|131)(1:128)|129|120)|132|133|(1:135)|136)|38|(1:40)(1:118)|(1:42)|43|(33:114|115|(1:49)|50|(1:52)|53|(27:105|(1:109)|(1:57)|58|(23:100|(1:104)|(1:62)|63|(2:96|(1:98)(18:99|(1:67)|68|(1:70)|71|(1:73)|74|(3:76|(1:79)|80)|81|(1:83)|84|(1:86)|87|(1:89)|90|(1:92)|93|94))|65|(0)|68|(0)|71|(0)|74|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|94)|60|(0)|63|(0)|65|(0)|68|(0)|71|(0)|74|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|94)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|71|(0)|74|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|94)|45|(33:110|111|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|71|(0)|74|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|94)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|71|(0)|74|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|94)|160|(2:168|169)|(1:167)|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|71|(0)|74|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|94)|181|(63:183|(1:185)|11|(0)|14|(0)|17|(0)|160|(1:162)|168|169|(1:165)|167|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|71|(0)|74|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|94)(1:193)|186|(3:188|(1:190)(1:192)|191)|11|(0)|14|(0)|17|(0)|160|(0)|168|169|(0)|167|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|71|(0)|74|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|94))|10|11|(0)|14|(0)|17|(0)|160|(0)|168|169|(0)|167|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|71|(0)|74|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|94) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0162, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0163, code lost:
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0315 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0202  */
    /* JADX WARN: Type inference failed for: r11v2, types: [o48, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v28, types: [n48, c3e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [int] */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.s6f a(com.google.firebase.messaging.FirebaseMessagingService r18, defpackage.fz4 r19) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq1.a(com.google.firebase.messaging.FirebaseMessagingService, fz4):s6f");
    }

    public static boolean b(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }
}
