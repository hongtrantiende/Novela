package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gne  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gne implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public gne(yze yzeVar, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.c = atomicReference;
        this.d = str;
        this.e = str2;
        this.b = z;
        Objects.requireNonNull(yzeVar);
        this.f = yzeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106 A[Catch: RuntimeException -> 0x00e6, TRY_ENTER, TryCatch #6 {RuntimeException -> 0x00e6, blocks: (B:22:0x0084, B:51:0x0106, B:53:0x0111, B:56:0x011e, B:58:0x0124, B:59:0x0139, B:61:0x0144, B:63:0x014a, B:66:0x0165, B:68:0x0174, B:67:0x016c, B:69:0x0187, B:71:0x018d, B:73:0x0193, B:75:0x0199, B:77:0x019f, B:79:0x01a7, B:81:0x01af, B:83:0x01b5, B:84:0x01c7, B:25:0x0097, B:27:0x009d, B:29:0x00a5, B:31:0x00ab, B:33:0x00b1, B:35:0x00b7, B:37:0x00bf, B:39:0x00c7, B:41:0x00cf, B:43:0x00d7, B:46:0x00eb, B:48:0x00f9), top: B:143:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a A[Catch: RuntimeException -> 0x00e6, TryCatch #6 {RuntimeException -> 0x00e6, blocks: (B:22:0x0084, B:51:0x0106, B:53:0x0111, B:56:0x011e, B:58:0x0124, B:59:0x0139, B:61:0x0144, B:63:0x014a, B:66:0x0165, B:68:0x0174, B:67:0x016c, B:69:0x0187, B:71:0x018d, B:73:0x0193, B:75:0x0199, B:77:0x019f, B:79:0x01a7, B:81:0x01af, B:83:0x01b5, B:84:0x01c7, B:25:0x0097, B:27:0x009d, B:29:0x00a5, B:31:0x00ab, B:33:0x00b1, B:35:0x00b7, B:37:0x00bf, B:39:0x00c7, B:41:0x00cf, B:43:0x00d7, B:46:0x00eb, B:48:0x00f9), top: B:143:0x0084 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gne.run():void");
    }

    public gne(gb4 gb4Var, boolean z, Uri uri, String str, String str2) {
        this.b = z;
        this.c = uri;
        this.d = str;
        this.e = str2;
        this.f = gb4Var;
    }

    public gne(AppMeasurementDynamiteService appMeasurementDynamiteService, hfe hfeVar, String str, String str2, boolean z) {
        this.c = hfeVar;
        this.d = str;
        this.e = str2;
        this.b = z;
        this.f = appMeasurementDynamiteService;
    }

    public /* synthetic */ gne(CloudMessagingReceiver cloudMessagingReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.c = cloudMessagingReceiver;
        this.d = intent;
        this.e = context;
        this.b = z;
        this.f = pendingResult;
    }

    public gne(w2f w2fVar, d8f d8fVar, boolean z, dbe dbeVar, Bundle bundle) {
        this.c = d8fVar;
        this.b = z;
        this.d = dbeVar;
        this.e = bundle;
        Objects.requireNonNull(w2fVar);
        this.f = w2fVar;
    }
}
