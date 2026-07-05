package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.SubtitleView;
import com.vbook.android.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j09  reason: default package */
/* loaded from: classes.dex */
public final class j09 extends FrameLayout {
    public final ImageView C;
    public final ImageView D;
    public final SubtitleView E;
    public final View F;
    public final TextView G;
    public final qz8 H;
    public final FrameLayout I;
    public final FrameLayout J;
    public final Handler K;
    public final Class L;
    public final Method M;
    public final Object N;
    public cz8 O;
    public boolean P;
    public g09 Q;
    public pz8 R;
    public int S;
    public int T;
    public Drawable U;
    public int V;
    public boolean W;
    public final f09 a;
    public CharSequence a0;
    public final AspectRatioFrameLayout b;
    public int b0;
    public final View c;
    public boolean c0;
    public final View d;
    public boolean d0;
    public final boolean e;
    public boolean e0;
    public final i09 f;
    public boolean f0;

    /* JADX WARN: Multi-variable type inference failed */
    public j09(Context context) {
        super(context, null, 0);
        i09 i09Var;
        Class<ExoPlayer> cls;
        Object obj;
        Method method;
        int i;
        int i2;
        f09 f09Var = new f09(this);
        this.a = f09Var;
        this.K = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = false;
            this.f = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.I = null;
            this.J = null;
            this.L = null;
            this.M = null;
            this.N = null;
            ImageView imageView = new ImageView(context);
            Resources resources = getResources();
            imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, context.getTheme()));
            imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            addView(imageView);
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.exo_player_view, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(0);
        }
        this.c = findViewById(R.id.exo_shutter);
        if (aspectRatioFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            SurfaceView surfaceView = new SurfaceView(context);
            if (Build.VERSION.SDK_INT >= 34) {
                k4.G(surfaceView);
            }
            this.d = surfaceView;
            surfaceView.setLayoutParams(layoutParams);
            surfaceView.setOnClickListener(f09Var);
            surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(surfaceView, 0);
        } else {
            this.d = null;
        }
        this.e = false;
        if (Build.VERSION.SDK_INT == 34) {
            i09Var = new Object();
        } else {
            i09Var = null;
        }
        this.f = i09Var;
        this.I = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.J = (FrameLayout) findViewById(R.id.exo_overlay);
        this.C = (ImageView) findViewById(R.id.exo_image);
        this.T = 0;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            obj = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: d09
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method2, Object[] objArr) {
                    if (method2.getName().equals("onImageAvailable")) {
                        j09 j09Var = j09.this;
                        j09Var.K.post(new ex2(20, j09Var, (Bitmap) objArr[1]));
                        return null;
                    }
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            obj = null;
            method = null;
        }
        this.L = cls;
        this.M = method;
        this.N = obj;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.D = imageView2;
        if (imageView2 != null) {
            i = 1;
        } else {
            i = 0;
        }
        this.S = i;
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.E = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View findViewById = findViewById(R.id.exo_buffering);
        this.F = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        this.V = 0;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.G = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        qz8 qz8Var = (qz8) findViewById(R.id.exo_controller);
        View findViewById2 = findViewById(R.id.exo_controller_placeholder);
        if (qz8Var != null) {
            this.H = qz8Var;
        } else if (findViewById2 != null) {
            qz8 qz8Var2 = new qz8(context);
            this.H = qz8Var2;
            qz8Var2.setId(R.id.exo_controller);
            qz8Var2.setLayoutParams(findViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById2.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById2);
            viewGroup.removeView(findViewById2);
            viewGroup.addView(qz8Var2, indexOfChild);
        } else {
            this.H = null;
        }
        qz8 qz8Var3 = this.H;
        if (qz8Var3 != null) {
            i2 = 5000;
        } else {
            i2 = 0;
        }
        this.b0 = i2;
        this.e0 = true;
        this.c0 = true;
        this.d0 = true;
        this.P = qz8Var3 != null;
        if (qz8Var3 != null) {
            vz8 vz8Var = qz8Var3.a;
            int i3 = vz8Var.A;
            if (i3 != 3 && i3 != 2) {
                vz8Var.f();
                vz8Var.i(2);
            }
            qz8 qz8Var4 = this.H;
            f09 f09Var2 = this.a;
            qz8Var4.getClass();
            f09Var2.getClass();
            qz8Var4.G.add(f09Var2);
        }
        setClickable(true);
        l();
    }

    public static void a(j09 j09Var, Bitmap bitmap) {
        j09Var.setImage(new BitmapDrawable(j09Var.getResources(), bitmap));
        cz8 cz8Var = j09Var.O;
        if (cz8Var != null) {
            i04 i04Var = (i04) cz8Var;
            if (i04Var.v(30) && i04Var.n().a(2)) {
                return;
            }
        }
        ImageView imageView = j09Var.C;
        if (imageView != null) {
            imageView.setVisibility(0);
            j09Var.o();
        }
        View view = j09Var.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.C;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        o();
    }

    private void setImageOutput(cz8 cz8Var) {
        Class cls = this.L;
        if (cls != null && cls.isAssignableFrom(cz8Var.getClass())) {
            try {
                Method method = this.M;
                method.getClass();
                Object obj = this.N;
                obj.getClass();
                method.invoke(cz8Var, obj);
            } catch (IllegalAccessException | InvocationTargetException e) {
                fb4.l(e);
            }
        }
    }

    public final boolean b() {
        cz8 cz8Var = this.O;
        if (cz8Var != null && this.N != null) {
            i04 i04Var = (i04) cz8Var;
            if (i04Var.v(30) && i04Var.n().a(4)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c() {
        ImageView imageView = this.C;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(17170445);
        }
    }

    public final boolean d() {
        cz8 cz8Var = this.O;
        if (cz8Var != null && ((i04) cz8Var).v(16) && ((i04) this.O).y() && ((i04) this.O).q()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        i09 i09Var;
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34 && (i09Var = this.f) != null && this.f0) {
            i09Var.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        cz8 cz8Var = this.O;
        if (cz8Var != null && ((i04) cz8Var).v(16) && ((i04) this.O).y()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19 && keyCode != 270 && keyCode != 22 && keyCode != 271 && keyCode != 20 && keyCode != 269 && keyCode != 21 && keyCode != 268 && keyCode != 23) {
            z = false;
        } else {
            z = true;
        }
        qz8 qz8Var = this.H;
        if (z && p() && !qz8Var.j()) {
            e(true);
            return true;
        } else if ((p() && qz8Var.d(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            e(true);
            return true;
        } else {
            if (z && p()) {
                e(true);
            }
            return false;
        }
    }

    public final void e(boolean z) {
        boolean z2;
        if ((!d() || !this.d0) && p()) {
            qz8 qz8Var = this.H;
            if (qz8Var.j() && qz8Var.getShowTimeoutMs() <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean g = g();
            if (z || z2 || g) {
                h(g);
            }
        }
    }

    public final boolean f(Drawable drawable) {
        ImageView imageView = this.D;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.S == 2) {
                    f = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        cz8 cz8Var = this.O;
        if (cz8Var == null) {
            return true;
        }
        int r = ((i04) cz8Var).r();
        if (this.c0) {
            if (!((i04) this.O).v(17) || !((i04) this.O).m().p()) {
                if (r != 1 && r != 4) {
                    cz8 cz8Var2 = this.O;
                    cz8Var2.getClass();
                    if (((i04) cz8Var2).q()) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public List<mce> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.J;
        if (frameLayout != null) {
            arrayList.add(new mce(frameLayout));
        }
        qz8 qz8Var = this.H;
        if (qz8Var != null) {
            arrayList.add(new mce(qz8Var));
        }
        return qs5.l(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.I;
        wq9.z(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.S;
    }

    public boolean getControllerAutoShow() {
        return this.c0;
    }

    public boolean getControllerHideOnTouch() {
        return this.e0;
    }

    public int getControllerShowTimeoutMs() {
        return this.b0;
    }

    public Drawable getDefaultArtwork() {
        return this.U;
    }

    public int getImageDisplayMode() {
        return this.T;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.J;
    }

    public cz8 getPlayer() {
        return this.O;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        aspectRatioFrameLayout.getClass();
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.E;
    }

    @Deprecated
    public boolean getUseArtwork() {
        if (this.S != 0) {
            return true;
        }
        return false;
    }

    public boolean getUseController() {
        return this.P;
    }

    public View getVideoSurfaceView() {
        return this.d;
    }

    public final void h(boolean z) {
        int i;
        if (!p()) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = this.b0;
        }
        qz8 qz8Var = this.H;
        qz8Var.setShowTimeoutMs(i);
        vz8 vz8Var = qz8Var.a;
        qz8 qz8Var2 = vz8Var.a;
        if (!qz8Var2.l()) {
            qz8Var2.setVisibility(0);
            qz8Var2.m();
            ImageView imageView = qz8Var2.R;
            if (imageView != null) {
                imageView.requestFocus();
            }
        }
        vz8Var.k();
    }

    public final void i() {
        if (p() && this.O != null) {
            qz8 qz8Var = this.H;
            if (!qz8Var.j()) {
                e(true);
            } else if (this.e0) {
                qz8Var.g();
            }
        }
    }

    public final void j() {
        uad uadVar;
        float f;
        cz8 cz8Var = this.O;
        if (cz8Var != null) {
            i04 i04Var = (i04) cz8Var;
            i04Var.X();
            uadVar = i04Var.l0;
        } else {
            uadVar = uad.d;
        }
        int i = uadVar.a;
        int i2 = uadVar.b;
        float f2 = nae.e;
        if (i2 != 0 && i != 0) {
            f = (i * uadVar.c) / i2;
        } else {
            f = 0.0f;
        }
        if (!this.e) {
            f2 = f;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (((defpackage.i04) r5.O).q() == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            r5 = this;
            android.view.View r0 = r5.F
            if (r0 == 0) goto L2d
            cz8 r1 = r5.O
            r2 = 0
            if (r1 == 0) goto L24
            i04 r1 = (defpackage.i04) r1
            int r1 = r1.r()
            r3 = 2
            if (r1 != r3) goto L24
            int r1 = r5.V
            r4 = 1
            if (r1 == r3) goto L25
            if (r1 != r4) goto L24
            cz8 r5 = r5.O
            i04 r5 = (defpackage.i04) r5
            boolean r5 = r5.q()
            if (r5 == 0) goto L24
            goto L25
        L24:
            r4 = r2
        L25:
            if (r4 == 0) goto L28
            goto L2a
        L28:
            r2 = 8
        L2a:
            r0.setVisibility(r2)
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j09.k():void");
    }

    public final void l() {
        String str = null;
        qz8 qz8Var = this.H;
        if (qz8Var != null && this.P) {
            if (qz8Var.j()) {
                if (this.e0) {
                    str = getResources().getString(R.string.exo_controls_hide);
                }
                setContentDescription(str);
                return;
            }
            setContentDescription(getResources().getString(R.string.exo_controls_show));
            return;
        }
        setContentDescription(null);
    }

    public final void m() {
        TextView textView = this.G;
        if (textView != null) {
            CharSequence charSequence = this.a0;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            cz8 cz8Var = this.O;
            if (cz8Var != null) {
                i04 i04Var = (i04) cz8Var;
                i04Var.X();
                pz3 pz3Var = i04Var.q0.f;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(boolean r11) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j09.n(boolean):void");
    }

    public final void o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.C;
        if (imageView != null && (drawable = imageView.getDrawable()) != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.T == 1) {
                    f = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.b) != null) {
                    aspectRatioFrameLayout.setAspectRatio(f);
                }
                imageView.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (p() && this.O != null) {
            e(true);
            return true;
        }
        return false;
    }

    public final boolean p() {
        if (this.P) {
            this.H.getClass();
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        i();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        boolean z;
        if (i != 0 && this.D == null) {
            z = false;
        } else {
            z = true;
        }
        wq9.D(z);
        if (this.S != i) {
            this.S = i;
            n(false);
        }
    }

    public void setAspectRatioListener(g00 g00Var) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        aspectRatioFrameLayout.getClass();
        aspectRatioFrameLayout.setAspectRatioListener(g00Var);
    }

    public void setControllerAnimationEnabled(boolean z) {
        qz8 qz8Var = this.H;
        qz8Var.getClass();
        qz8Var.setAnimationEnabled(z);
    }

    public void setControllerAutoShow(boolean z) {
        this.c0 = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.d0 = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        this.H.getClass();
        this.e0 = z;
        l();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(gz8 gz8Var) {
        qz8 qz8Var = this.H;
        qz8Var.getClass();
        qz8Var.setOnFullScreenModeChangedListener(gz8Var);
    }

    public void setControllerShowTimeoutMs(int i) {
        qz8 qz8Var = this.H;
        qz8Var.getClass();
        this.b0 = i;
        if (qz8Var.j()) {
            h(g());
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(pz8 pz8Var) {
        qz8 qz8Var = this.H;
        qz8Var.getClass();
        pz8 pz8Var2 = this.R;
        if (pz8Var2 != pz8Var) {
            if (pz8Var2 != null) {
                qz8Var.G.remove(pz8Var2);
            }
            this.R = pz8Var;
            if (pz8Var != null) {
                qz8Var.getClass();
                qz8Var.G.add(pz8Var);
                setControllerVisibilityListener((g09) null);
            }
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        boolean z;
        if (this.G != null) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        this.a0 = charSequence;
        m();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.U != drawable) {
            this.U = drawable;
            n(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z) {
        this.f0 = z;
    }

    public void setErrorMessageProvider(nw3 nw3Var) {
        if (nw3Var != null) {
            m();
        }
    }

    public void setFullscreenButtonClickListener(h09 h09Var) {
        qz8 qz8Var = this.H;
        qz8Var.getClass();
        qz8Var.setOnFullScreenModeChangedListener(this.a);
    }

    public void setFullscreenButtonState(boolean z) {
        qz8 qz8Var = this.H;
        qz8Var.getClass();
        qz8Var.o(z);
    }

    public void setImageDisplayMode(int i) {
        boolean z;
        if (this.C != null) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        if (this.T != i) {
            this.T = i;
            o();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.W != z) {
            this.W = z;
            n(false);
        }
    }

    public void setMediaRouteButtonViewProvider(aed aedVar) {
        qz8 qz8Var = this.H;
        qz8Var.getClass();
        qz8Var.setMediaRouteButtonViewProvider(aedVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01d1, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d5, code lost:
        if (r2 != false) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setPlayer(defpackage.cz8 r12) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j09.setPlayer(cz8):void");
    }

    public void setRepeatToggleModes(int i) {
        qz8 qz8Var = this.H;
        qz8Var.getClass();
        qz8Var.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        aspectRatioFrameLayout.getClass();
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.V != i) {
            this.V = i;
            k();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        qz8 qz8Var = this.H;
        qz8Var.getClass();
        qz8Var.setShowFastForwardButton(z);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        qz8 qz8Var = this.H;
        qz8Var.getClass();
        qz8Var.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        qz8 qz8Var = this.H;
        qz8Var.getClass();
        qz8Var.setShowNextButton(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        qz8 qz8Var = this.H;
        qz8Var.getClass();
        qz8Var.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setShowPreviousButton(boolean z) {
        qz8 qz8Var = this.H;
        qz8Var.getClass();
        qz8Var.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        qz8 qz8Var = this.H;
        qz8Var.getClass();
        qz8Var.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        qz8 qz8Var = this.H;
        qz8Var.getClass();
        qz8Var.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        qz8 qz8Var = this.H;
        qz8Var.getClass();
        qz8Var.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        qz8 qz8Var = this.H;
        qz8Var.getClass();
        qz8Var.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        qz8 qz8Var = this.H;
        qz8Var.getClass();
        qz8Var.setTimeBarScrubbingEnabled(z);
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2;
        boolean z3 = true;
        qz8 qz8Var = this.H;
        if (z && qz8Var == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        wq9.D(z2);
        if (!z && !hasOnClickListeners()) {
            z3 = false;
        }
        setClickable(z3);
        if (this.P == z) {
            return;
        }
        this.P = z;
        if (p()) {
            qz8Var.setPlayer(this.O);
        } else if (qz8Var != null) {
            qz8Var.g();
            qz8Var.setPlayer(null);
        }
        l();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void setControllerVisibilityListener(g09 g09Var) {
        this.Q = g09Var;
        if (g09Var != null) {
            setControllerVisibilityListener((pz8) null);
        }
    }
}
