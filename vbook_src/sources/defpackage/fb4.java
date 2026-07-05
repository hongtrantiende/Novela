package defpackage;

import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.publicvalue.multiplatform.oidc.appsupport.HandleRedirectActivity;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fb4 */
/* loaded from: classes.dex */
public final /* synthetic */ class fb4 implements Continuation, OnFailureListener, hu1, SuccessContinuation, kx3, u94, ib8, tk5 {
    public final /* synthetic */ int a;

    public /* synthetic */ fb4(int i) {
        this.a = i;
    }

    public static void a(int i) {
        throw new IllegalArgumentException(a82.j(i, "An unknown field for index "));
    }

    public static /* synthetic */ void c(int i, String str, Object obj, int i2) {
        throw new IllegalArgumentException((str + i + obj + i2).toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2) {
        throw new AndroidRuntimeException("Fragment " + obj + obj2);
    }

    public static /* synthetic */ void g(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void k(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void l(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new IOException(str + obj);
    }

    @Override // defpackage.u94
    public r94[] b() {
        switch (this.a) {
            case 15:
                return new r94[]{new zh4()};
            default:
                return new r94[]{new am4()};
        }
    }

    @Override // defpackage.tk5
    public boolean e(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // defpackage.ib8
    public tjd i(View view, tjd tjdVar) {
        tn4 tn4Var = HandleRedirectActivity.R;
        view.getClass();
        cx5 i = tjdVar.a.i(647);
        i.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = i.b;
            marginLayoutParams.leftMargin = i.a;
            marginLayoutParams.bottomMargin = i.d;
            marginLayoutParams.rightMargin = i.c;
            view.setLayoutParams(marginLayoutParams);
            return tjd.b;
        }
        xk5.k("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        return null;
    }

    @Override // defpackage.hu1
    public Object j(yv yvVar) {
        ig4 lambda$getComponents$0;
        ug4 components$lambda$0;
        xg4 components$lambda$1;
        switch (this.a) {
            case 8:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(yvVar);
                return lambda$getComponents$0;
            case 13:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(yvVar);
                return components$lambda$0;
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(yvVar);
                return components$lambda$1;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        fic ficVar = (fic) obj;
        switch (this.a) {
            case 9:
                ficVar.getClass();
                Task a = ficVar.a(new cic("S", "chatbox"));
                ficVar.c();
                return a;
            default:
                ficVar.getClass();
                Task a2 = ficVar.a(new cic("U", "chatbox"));
                ficVar.c();
                return a2;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i;
        switch (this.a) {
            case 0:
                i = 403;
                break;
            default:
                i = -1;
                break;
        }
        return Integer.valueOf(i);
    }
}
