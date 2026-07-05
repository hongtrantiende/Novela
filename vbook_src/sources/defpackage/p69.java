package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p69  reason: default package */
/* loaded from: classes.dex */
public final class p69 {
    public static final p69 a = new Object();

    /* JADX WARN: Type inference failed for: r6v2, types: [vb0, java.lang.Object] */
    public static ArrayList a(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> list;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
            list = ks3.a;
        }
        ArrayList a0 = sl1.a0(list);
        ArrayList arrayList = new ArrayList();
        int size = a0.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = a0.get(i3);
            i3++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            ?? obj3 = new Object();
            String str2 = runningAppProcessInfo.processName;
            if (str2 != null) {
                obj3.a = str2;
                obj3.b = runningAppProcessInfo.pid;
                obj3.c = runningAppProcessInfo.importance;
                obj3.e = (byte) (((byte) (obj3.e | 1)) | 2);
                obj3.d = c16.i(str2, str);
                obj3.e = (byte) (obj3.e | 4);
                arrayList2.add(obj3.a());
            } else {
                xk5.k("Null processName");
                return null;
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [vb0, java.lang.Object] */
    public fa2 b(Context context) {
        Object obj;
        String str;
        context.getClass();
        int myPid = Process.myPid();
        ArrayList a2 = a(context);
        int size = a2.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = a2.get(i);
                i++;
                if (((wb0) ((fa2) obj)).b == myPid) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        fa2 fa2Var = (fa2) obj;
        if (fa2Var == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 > 33) {
                str = Process.myProcessName();
                str.getClass();
            } else if (i2 < 28 || (str = Application.getProcessName()) == null) {
                str = "";
            }
            ?? obj2 = new Object();
            obj2.a = str;
            obj2.b = myPid;
            obj2.c = 0;
            obj2.d = false;
            obj2.e = (byte) (((byte) (((byte) (obj2.e | 1)) | 2)) | 4);
            return obj2.a();
        }
        return fa2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r4 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00da, code lost:
        if (r6 == null) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(defpackage.n07 r7) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p69.c(n07):void");
    }
}
