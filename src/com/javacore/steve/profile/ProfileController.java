package com.javacore.steve.profile;

import com.javacore.steve.common.ConsoleCanvas;

public class ProfileController {
    private ProfileModel model/*profileModel*/;
    private ProfileView view;
    private ProfileStore store;
    private ConsoleCanvas canvas;


    {
        ProfileStore.INSTANCE.loadData();
        view = new ProfileView();
       // canvas = new ConsoleCanvas();

    }

    public ProfileModel getModel() {
        return model;

    }

    public void setModel(ProfileModel model) {
        this.model = model;
    }

    public ProfileView getView() {
        return view;
    }

    public void setView(ProfileView view) {
        this.view = view;
    }

    public void showProfile(int id) {
        ProfileModel model = ProfileStore.INSTANCE.getProfile(id);
        if (model == null) {
            System.out.println("No record with id " + id);
        } else {
            view.setModel(model);
            view.draw(canvas);

        }
    }
}
