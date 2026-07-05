package com.reader.android;

import android.app.Application;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public final class AndroidApp extends Application {
    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        cl7 cl7Var = new cl7(new cl7(this, 22), 3);
        synchronized (hq7.I) {
            n96 n96Var = new n96();
            if (hq7.J == null) {
                hq7.J = n96Var.a;
                cl7Var.invoke(n96Var);
                n96Var.a.a();
            } else {
                throw new e60(15, "A Koin Application has already been started", false);
            }
        }
    }
}
