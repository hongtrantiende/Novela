package androidx.media3.exoplayer.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class PlatformScheduler$PlatformSchedulerService extends JobService {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
        if (r6.hasCapability(16) != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStartJob(android.app.job.JobParameters r11) {
        /*
            r10 = this;
            android.os.PersistableBundle r0 = r11.getExtras()
            java.lang.String r1 = "requirements"
            int r1 = r0.getInt(r1)
            r2 = r1 & 2
            if (r2 == 0) goto L10
            r1 = r1 | 1
        L10:
            r2 = r1 & 1
            r3 = 0
            r4 = 2
            r5 = 16
            if (r2 == 0) goto L4e
            java.lang.String r2 = "connectivity"
            java.lang.Object r2 = r10.getSystemService(r2)
            r2.getClass()
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            android.net.NetworkInfo r6 = r2.getActiveNetworkInfo()
            if (r6 == 0) goto L50
            boolean r6 = r6.isConnected()
            if (r6 == 0) goto L50
            android.net.Network r6 = r2.getActiveNetwork()
            if (r6 != 0) goto L36
            goto L50
        L36:
            android.net.NetworkCapabilities r6 = r2.getNetworkCapabilities(r6)     // Catch: java.lang.SecurityException -> L42
            if (r6 == 0) goto L50
            boolean r6 = r6.hasCapability(r5)     // Catch: java.lang.SecurityException -> L42
            if (r6 == 0) goto L50
        L42:
            r6 = r1 & 2
            if (r6 == 0) goto L4e
            boolean r2 = r2.isActiveNetworkMetered()
            if (r2 == 0) goto L4e
            r2 = r4
            goto L52
        L4e:
            r2 = r3
            goto L52
        L50:
            r2 = r1 & 3
        L52:
            r6 = r1 & 8
            r7 = 0
            if (r6 == 0) goto L74
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r8 = "android.intent.action.BATTERY_CHANGED"
            r6.<init>(r8)
            android.content.Intent r6 = r10.registerReceiver(r7, r6)
            if (r6 != 0) goto L65
            goto L72
        L65:
            java.lang.String r8 = "status"
            r9 = -1
            int r6 = r6.getIntExtra(r8, r9)
            if (r6 == r4) goto L74
            r4 = 5
            if (r6 != r4) goto L72
            goto L74
        L72:
            r2 = r2 | 8
        L74:
            r4 = r1 & 4
            if (r4 == 0) goto L8b
            java.lang.String r4 = "power"
            java.lang.Object r4 = r10.getSystemService(r4)
            r4.getClass()
            android.os.PowerManager r4 = (android.os.PowerManager) r4
            boolean r4 = r4.isDeviceIdleMode()
            if (r4 != 0) goto L8b
            r2 = r2 | 4
        L8b:
            r1 = r1 & r5
            if (r1 == 0) goto L9e
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r4 = "android.intent.action.DEVICE_STORAGE_LOW"
            r1.<init>(r4)
            android.content.Intent r1 = r10.registerReceiver(r7, r1)
            if (r1 != 0) goto L9c
            goto L9e
        L9c:
            r2 = r2 | 16
        L9e:
            if (r2 != 0) goto Lbf
            java.lang.String r11 = "service_action"
            java.lang.String r11 = r0.getString(r11)
            r11.getClass()
            java.lang.String r1 = "service_package"
            java.lang.String r0 = r0.getString(r1)
            r0.getClass()
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r11)
            android.content.Intent r11 = r1.setPackage(r0)
            defpackage.a2d.c0(r10, r11)
            goto Lca
        Lbf:
            java.lang.String r0 = "PlatformScheduler"
            java.lang.String r1 = "Requirements not met: "
            defpackage.a82.y(r1, r0, r2)
            r0 = 1
            r10.jobFinished(r11, r0)
        Lca:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.scheduler.PlatformScheduler$PlatformSchedulerService.onStartJob(android.app.job.JobParameters):boolean");
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
